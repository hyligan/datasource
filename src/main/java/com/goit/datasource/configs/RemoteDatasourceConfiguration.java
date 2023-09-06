package com.goit.datasource.configs;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class RemoteDatasourceConfiguration {

    @Bean
    @ConfigurationProperties("spring.datasource.remote")
    public DataSourceProperties topicsDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean("remoteDataSource")
    public DataSource remoteDataSource() {
        return topicsDataSourceProperties()
          .initializeDataSourceBuilder()
          .build();
    }

}
