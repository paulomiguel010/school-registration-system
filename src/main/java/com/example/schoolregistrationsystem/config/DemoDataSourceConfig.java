//package com.example.schoolregistrationsystem.config;
//
//import javax.sql.DataSource;
//
//import com.zaxxer.hikari.HikariDataSource;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//
//@Configuration
//@EnableJpaRepositories(basePackages ={"com.example.schoolregistrationsystem.DAO"})
//
//public class DemoDataSourceConfig {
//
//    @Primary
//    @Bean
//    @ConfigurationProperties("spring.datasource")
//    public DataSource appDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean
//   @ConfigurationProperties("com.example.schoolregistrationsystem.entity")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder, DataSource appDataSource) {
//        return builder
//                .dataSource(appDataSource)
//                .build();
//    }
////    @ConfigurationProperties(prefix="spring.datasource")
////    public DataSource securityDataSource() {
////        return DataSourceBuilder.create().build();
////    }
//}
