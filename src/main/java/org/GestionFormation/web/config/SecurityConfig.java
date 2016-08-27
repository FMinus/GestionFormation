/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package org.GestionFormation.web.config;

import javax.ws.rs.HttpMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author Ayoub
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
    @Autowired
    private AppUserDetailsService appUserDetailsService;
    
    @Override
    protected void configure(AuthenticationManagerBuilder registry) throws Exception
    {
        // l'authentification est faite par le bean [appUserDetailsService]
        registry.userDetailsService(appUserDetailsService);
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        // CSRF
        http.csrf().disable();
        
        // l'authentification est faite par le header Authorization: Basic xxxx
        http.httpBasic();
        
        // le dossier [app] est accessible à tous
        http.authorizeRequests() //
            .antMatchers(HttpMethod.GET, "/app", "/app/**").permitAll();
    }
    
}
