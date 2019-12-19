package com.selfexp.springBootExperiment.config;

import com.selfexp.springBootExperiment.entity.sql.Clinic;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "mysqlEntityManagerFactory",
        transactionManagerRef = "mysqlTransactionManager",
        basePackages = {"com.selfexp.springBootExperiment.repository.sqlRepository"}
)
public class MySQLDatasourceConfiguration {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "mysql.datasource")
    public DataSource mysqlDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    PlatformTransactionManager mysqlTransactionManager(
            @Qualifier("mysqlEntityManagerFactory") LocalContainerEntityManagerFactoryBean mysqlEntityManagerFactory) {
        return new JpaTransactionManager(mysqlEntityManagerFactory.getObject());
    }

    @Bean
    LocalContainerEntityManagerFactoryBean mysqlEntityManagerFactory(
            @Qualifier("mysqlDataSource") DataSource mysqlDataSource, EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(mysqlDataSource)
                .packages(Clinic.class)
                .build();
    }
}