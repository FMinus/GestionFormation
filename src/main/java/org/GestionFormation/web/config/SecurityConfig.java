/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package org.GestionFormation.web.config;

import org.GestionFormation.web.config.authentication.CustomAuthenticationProvider;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
/**
 *
 * @author Ayoub
 */
@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
   
    
//    @Autowired
//    private AppUserDetailsService appUserDetailsService;
    
  
    
//    @Override
//    protected void configure(AuthenticationManagerBuilder registry) throws Exception
//    {
//        // l'authentification est faite par le bean [appUserDetailsService]
//        //registry.userDetailsService(appUserDetailsService);
//        
////        registry.inMemoryAuthentication()
////            .withUser("user").password("user").roles("USER").and()
////            .withUser("admin").password("admin").roles("USER", "ADMIN");
//        
//        
//    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        
        // CSRF
       
                //.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());;
        
        // l'authentification est faite par le header Authorization: Basic xxxx
        http.httpBasic();
        
        //http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        
        
        
        // le dossier [app] est accessible à tous
      http
           .authorizeRequests() 
                .antMatchers("/css/**" , "/js/**","/images/**","/app/**","/favicon.ico","/fonts/**").permitAll()
                .antMatchers("/app/views/login.html","/login","/utilisateurs/user").permitAll()
                .antMatchers("/app/views/index.html").authenticated()
                
       
//            .and()
//                .formLogin()
//                    .loginPage("/app/views/login.html").permitAll()
//                    .defaultSuccessUrl("/app/views/index.html")
//            
//                
//            .and()
//                .logout()
//                    .invalidateHttpSession(true)
//                    .logoutUrl("/logout").permitAll()
//                    .clearAuthentication(true)
                    
            
              .anyRequest().authenticated()
              .and()
                .csrf()
                    .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())

        ;
        
       
        
//        http
//            .authorizeRequests()
//            .antMatchers(HttpMethod.POST, "/utilisateurs/**").hasRole("ADMIN")
//            .antMatchers("/logout").permitAll()
//            
//            .and()
//            .httpBasic()
//                .and()
//             .logout()
//                   .invalidateHttpSession(true)
//                   .logoutUrl("/logout")
//                   .permitAll()
//                .and()
//             .authorizeRequests() 
//               .anyRequest().fullyAuthenticated();
    }
  
    @Bean
    AuthenticationProvider customAuthenticationProvider() 
    {
        System.out.println("customAuthenticationProvider called in config");
        CustomAuthenticationProvider impl = new CustomAuthenticationProvider();
        
        impl.setUserDetailsService(customUserDetailsService());
        /* other properties etc */
        return impl ;
    }
    


//    private Filter csrfHeaderFilter()
//    {
//    	return new FilterThatSendsCookie("XSRF-TOKEN");
//    }
    @Bean
    public UserDetailsService customUserDetailsService()
    {
        return null;
    }
    
}