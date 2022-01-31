package com.jtmc.apps.boutique.guice;

import com.google.inject.name.Names;
import com.jtmc.apps.boutique.domain.Persona;
import com.jtmc.apps.boutique.repository.mapper.PersonaMapper;
import com.jtmc.apps.boutique.repository.mapper.UsersMapper;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.guice.MyBatisModule;
import org.mybatis.guice.datasource.builtin.PooledDataSourceProvider;

import java.util.Properties;

public class BoutiqueMyBatisModule extends MyBatisModule {

    @Override
    protected void initialize() {
        Properties myBatisProperties = new Properties();
        myBatisProperties.setProperty("mybatis.environment.id", "test");
        myBatisProperties.setProperty("JDBC.host", System.getenv("JDBC_HOST"));
        myBatisProperties.setProperty("JDBC.port", System.getenv("JDBC_PORT"));
        myBatisProperties.setProperty("JDBC.schema", System.getenv("JDBC_SCHEMA"));
        myBatisProperties.setProperty("JDBC.username", System.getenv("JDBC_USER"));
        myBatisProperties.setProperty("JDBC.password", System.getenv("JDBC_PASSWORD"));
        myBatisProperties.setProperty("JDBC.autoCommit", "false");

        bindDataSourceProviderType(PooledDataSourceProvider.class);
        bindTransactionFactoryType(JdbcTransactionFactory.class);

        Names.bindProperties(binder(), myBatisProperties);

        addMapperClass(PersonaMapper.class);
        addMapperClass(UsersMapper.class);
    }
}
