package com.MultiDb.postgres.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
    entityManagerFactoryRef = "sEntityManagerFactoryBean",
    basePackages = {"com.MultiDb.postgres.repo"},
    transactionManagerRef = "sTransactionManager"
)
public class PostGresDbConfig {
    @Autowired
    private Environment environment;

    @Bean(name = "sDataSource")
    @Primary
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(environment.getProperty("second.datasource.url"));
        dataSource.setDriverClassName(environment.getProperty("second.datasource.driverClassName"));
        dataSource.setUsername(environment.getProperty("second.datasource.username"));
        dataSource.setPassword(environment.getProperty("second.datasource.password")); // You should also set the password
        return dataSource;
    }

    @Bean(name = "sEntityManagerFactoryBean")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(dataSource());
        bean.setPackagesToScan("com.MultiDb.postgres.entities");

        JpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        bean.setJpaVendorAdapter(adapter);

        Map<String, String> props = new HashMap<>();
        props.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        props.put("hibernate.show_sql", "true");
        props.put("hibernate.hbm2ddl.auto", "update");
        bean.setJpaPropertyMap(props);

        return bean;
    }

    @Bean(name = "sTransactionManager")
    @Primary
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager manager = new JpaTransactionManager(entityManagerFactoryBean().getObject());
        return manager;
    }
}
