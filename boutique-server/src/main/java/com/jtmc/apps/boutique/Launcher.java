package com.jtmc.apps.boutique;

import com.google.common.collect.Sets;
import com.google.inject.AbstractModule;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.name.Names;
import com.jtmc.apps.boutique.api.v1.healthcheck.HealthcheckApi;
import com.jtmc.apps.boutique.api.v1.healthcheck.HealthcheckApiImpl;
import com.jtmc.apps.boutique.api.v1.login.LoginApi;
import com.jtmc.apps.boutique.api.v1.login.LoginApiImpl;
import com.jtmc.apps.boutique.guice.BoutiqueMyBatisModule;
import org.apache.cxf.jaxrs.servlet.CXFNonSpringJaxrsServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.mybatis.guice.datasource.helper.JdbcHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;
import java.util.Set;

public class Launcher {

    final private static Logger logger = LoggerFactory.getLogger(Launcher.class);

    public static void main(String[] args) {
        startJettyServer();
    }

    private static class JettyLauncherModule extends AbstractModule {
        @Override
        protected void configure() {
            install(new BoutiqueMyBatisModule());
            install(JdbcHelper.SQL_Server_2005_MS_Driver);

            bind(HealthcheckApi.class).to(HealthcheckApiImpl.class);
            bind(LoginApi.class).to(LoginApiImpl.class);

            Properties myProperties = new Properties();
            myProperties.setProperty("key", System.getenv("key"));
            Names.bindProperties(binder(), myProperties);
        }
    }

    private static class BoutiqueApplication extends GuiceApplication {
        @Override
        protected Set<Module> modules() {
            return Sets.newHashSet(new JettyLauncherModule());
        }

        @Override
        protected Set<Object> serviceInstances(Injector injector) {
            return Sets.newHashSet(
                    injector.getInstance(HealthcheckApiImpl.class),
                    injector.getInstance(LoginApiImpl.class)
            );
        }
    }

    private static void startJettyServer() {

        HandlerCollection handlers = new HandlerCollection();

        ServletHolder servletHolder = new ServletHolder(
                new CXFNonSpringJaxrsServlet(new BoutiqueApplication()));

        ServletContextHandler servletContextHandler = new ServletContextHandler();
        servletContextHandler.setContextPath("/");
        servletContextHandler.addServlet(servletHolder, "/boutique-service/api/*");

        handlers.addHandler(servletContextHandler);

        Server jettyServer = new Server();
        ServerConnector serverConnector = new ServerConnector(jettyServer);
        serverConnector.setPort(8080);
        jettyServer.addConnector(serverConnector);

        jettyServer.setHandler(handlers);

        try {
            jettyServer.start();
            logger.info("Server started");
            jettyServer.join();
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        } finally {
            jettyServer.destroy();
        }
    }
}
