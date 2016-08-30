/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package org.GestionFormation.web.config;

import org.GestionFormation.web.config.appUser.AppUserDetailsService;
import javax.ws.rs.HttpMethod;
import org.GestionFormation.web.config.handlers.CustomSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
/**
 *
 * @author Ayoub
 */
@EnableAutoConfiguration
@EnableWebSecurity
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
//        // CSRF
//        http.csrf().disable();
//        
//        // l'authentification est faite par le header Authorization: Basic xxxx
//        http.httpBasic();
//        
//        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//        
//        
//        
//        // le dossier [app] est accessible à tous
//        http
//            .authorizeRequests() //
//                .antMatchers("/css/**" , "/js/**","/images/**","/app/**","/favicon.ico").permitAll()
//                .antMatchers("/app/views/login").permitAll()
//                .antMatchers("/app/views/index.html").authenticated()
//                .anyRequest().authenticated()
//       
//            .and()
//                .formLogin()
//                    .loginPage("/app/views/login.html").permitAll()
//                    .defaultSuccessUrl("/app/views/index.html")
//            .and()
//                .logout()
//                    .invalidateHttpSession(true)
//                    .logoutUrl("/logout")
//                    .permitAll()
//
//        ;
//        
//        
        
        http
            .authorizeRequests()
            .anyRequest().fullyAuthenticated()
            .and()
            .httpBasic();
    }
    
    
}
