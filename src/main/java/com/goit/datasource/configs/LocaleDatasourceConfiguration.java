package com.goit.datasource.configs;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class LocaleDatasourceConfiguration {

    @Bean
    @ConfigurationProperties("spring.datasource.locale")
    public DataSourceProperties todosDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean("localeDataSource")
    @Primary
    public DataSource localeDataSource() {
        return todosDataSourceProperties()
          .initializeDataSourceBuilder()
          .build();
    }

}
