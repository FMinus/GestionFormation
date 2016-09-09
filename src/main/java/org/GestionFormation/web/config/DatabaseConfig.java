/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.config;

import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

/**
 *
 * @author Ayoub
 */
@Configuration
public class DatabaseConfig
{
//    @Bean
//    @Primary
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource dataSource() 
//    {
//        return DataSourceBuilder.create().build();
//    }
    
  @Bean
  public DataSource dataSource() 
  {
    DriverManagerDataSource driver = new DriverManagerDataSource();
    driver.setDriverClassName("org.postgresql.Driver");
    driver.setUrl("jdbc:postgresql://ec2-54-75-230-128.eu-west-1.compute.amazonaws.com:5432/d4apk3381p3q81");
    driver.setUsername("vzzcihfqfomxzk");
    driver.setPassword("mWB7SO-pEOFjTBX_8CpNALy1us");
    return driver;
  }

}
