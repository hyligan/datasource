package com.goit.datasource.configs;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Objects;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
    basePackages = "com.goit.datasource.repo.locale",
  entityManagerFactoryRef = "localeEntityManagerFactory",
  transactionManagerRef = "localeTransactionManager"
)
public class LocaleJpaConfiguration {
    @Primary
    @Bean("localeEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean localeEntityManagerFactory(
      @Qualifier("localeDataSource") DataSource dataSource) { 
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setPackagesToScan(new String[] { "com.goit.datasource.entiteis.locale" });

        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);

        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        em.setJpaProperties(properties);
        return em;
    }

    @Bean
    public PlatformTransactionManager localeTransactionManager(
      @Qualifier("localeEntityManagerFactory") LocalContainerEntityManagerFactoryBean localeEntityManagerFactory) {
        return new JpaTransactionManager(Objects.requireNonNull(localeEntityManagerFactory.getObject()));
    }
}
