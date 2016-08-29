/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package org.GestionFormation.web.config;

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
     public static final String REMEMBER_ME_KEY = "rememberme_key";
     
    @Autowired
    private AppUserDetailsService appUserDetailsService;
    
    @Autowired
    CustomSuccessHandler customSuccessHandler;
 
    
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
        
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        
        
        
        // le dossier [app] est accessible à tous
        http
            .authorizeRequests() //
                .antMatchers("/css/**" , "/js/**","/images/**","/app/**","/favicon.ico").permitAll()
                .antMatchers("/app/views/login").permitAll()
                .anyRequest().authenticated()
//                .antMatchers(HttpMethod.GET, "/app", "/app/**").permitAll()
//                .antMatchers("/utilisateurs").hasRole("ADMINISTRATEUR")
//                .antMatchers(HttpMethod.GET,"/utilisateurs/*").hasRole("ADMINISTRATEUR")
//                .antMatchers(HttpMethod.POST,"/utilisateurs/*").hasRole("ADMINISTRATEUR")
            .and()
                .formLogin()
                    .loginPage("/app/views/login.html").permitAll()
                    .usernameParameter("emailUtilisateur")
                    .passwordParameter("passwordUtilisateur")
                    .defaultSuccessUrl("/app/views/index.html")
            .and()
                .logout()
                    .invalidateHttpSession(true)
                    .logoutUrl("/logout")
                    .permitAll()
            
                ;
    }
    
}
