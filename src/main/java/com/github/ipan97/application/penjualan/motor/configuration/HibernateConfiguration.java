/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ipan97.application.penjualan.motor.configuration;

import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

/**
 *
 * @author ifan
 */
@Configuration
@ComponentScan({"com.github.ipan97.application.penjualan.motor.configuration"})
@PropertySource(value = {"classpath:application.properties"})
public class HibernateConfiguration {

	@Autowired
	private Environment environment;

	@Bean
	private DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty("spring.driverClassName"));
		dataSource.setUrl(environment.getRequiredProperty("spring.url"));
		dataSource.setUsername(environment.getRequiredProperty("spring.username"));
		dataSource.setPassword(environment.getRequiredProperty("spring.password"));
		return dataSource;
	}

	@Bean
	private LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(
			new String[]{"com.github.ipan97.application.penjualan.motor.model"});
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}

	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.hbm2ddl.auto",environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
		properties.put("hibernate.show_sql",environment.getRequiredProperty("hibernate.show_sql"));
		properties.put("hibernate.format_sql",environment.getRequiredProperty("hibernate.format_sql"));
		return properties;
	}
	@Bean
	@Autowired
	private HibernateTransactionManager transactionManager(SessionFactory sf){
		HibernateTransactionManager transactionManager=new HibernateTransactionManager();
		transactionManager.setSessionFactory(sf);
	return transactionManager;
	}
}
