package com.selfexp.springBootExperiment.config;

import com.selfexp.springBootExperiment.entity.postgres.Doctor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "postgresEntityManagerFactory",
        transactionManagerRef = "postgresTransactionManager",
        basePackages = {"com.selfexp.springBootExperiment.repository.postgresRepository"}
)
public class PostgresDatasourceConfiguration {
    @Bean
    @ConfigurationProperties(prefix = "postgres.datasource")
    DataSource postgresDatasource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    PlatformTransactionManager postgresTransactionManager(
            @Qualifier("postgresEntityManagerFactory") LocalContainerEntityManagerFactoryBean postgresEntityManagerFactory) {
        return new JpaTransactionManager(postgresEntityManagerFactory.getObject());
    }

    @Bean
    LocalContainerEntityManagerFactoryBean postgresEntityManagerFactory(
            @Qualifier("postgresDatasource") DataSource postgresDatasource, EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(postgresDatasource)
                .packages(Doctor.class)
                .build();
    }
}