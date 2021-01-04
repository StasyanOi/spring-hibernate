package com.app.config;

import com.zaxxer.hikari.HikariDataSource;
import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.PostgreSQL9Dialect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import java.util.Properties;

@Configuration
@PropertySource("classpath:application.properties")
public class HibernateConfiguration {

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Bean
    public HikariDataSource driverManagerDatasource() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setJdbcUrl(jdbcUrl);
        hikariDataSource.setUsername(username);
        hikariDataSource.setPassword(password);
        return hikariDataSource;
    }

    @Bean
    public LocalSessionFactoryBean localSessionFactoryBean() {
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        Properties properties = new Properties();
        properties.setProperty(HibernateProperties.HIBERNATE_HBM2DDL_AUTO, "create");
        properties.setProperty(HibernateProperties.HIBERNATE_DIALECT, "org.hibernate.dialect.PostgreSQL9Dialect");
        localSessionFactoryBean.setPackagesToScan("com.app.entities");
        localSessionFactoryBean.setHibernateProperties(properties);
        localSessionFactoryBean.setDataSource(driverManagerDatasource());
        return localSessionFactoryBean;
    }

}
