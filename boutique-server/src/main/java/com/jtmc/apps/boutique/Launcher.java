package com.jtmc.apps.boutique;

import com.google.common.collect.Sets;
import com.google.inject.AbstractModule;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.jtmc.apps.boutique.api.v1.healthcheck.HealthcheckApi;
import com.jtmc.apps.boutique.api.v1.healthcheck.HealthcheckApiImpl;
import org.apache.cxf.jaxrs.servlet.CXFNonSpringJaxrsServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import java.util.Set;

public class Launcher {

    public static void main(String[] args) {
        startJettyServer();
    }

    private static class JettyLauncherModule extends AbstractModule {
        @Override
        protected void configure() {
            bind(HealthcheckApi.class).to(HealthcheckApiImpl.class);
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
                    injector.getInstance(HealthcheckApiImpl.class)
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
            jettyServer.join();
        } catch (Exception ex) {
            //todo: implement logger
//            LOGGER.error(ex.getMessage());
            System.out.println(ex.getMessage());
        } finally {
            jettyServer.destroy();
        }
    }
}
