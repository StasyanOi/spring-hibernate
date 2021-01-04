package com.app.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import java.util.Properties;

@Configuration
public class HibernateConfiguration {

    @Bean
    public HikariDataSource driverManagerDatasource() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        hikariDataSource.setUsername("postgres");
        hikariDataSource.setPassword("postgres");
        return hikariDataSource;
    }

    @Bean
    public LocalSessionFactoryBean localSessionFactoryBean() {
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "create");
        localSessionFactoryBean.setPackagesToScan("com.app.entities");
        localSessionFactoryBean.setHibernateProperties(properties);
        localSessionFactoryBean.setDataSource(driverManagerDatasource());
        return localSessionFactoryBean;
    }

}
