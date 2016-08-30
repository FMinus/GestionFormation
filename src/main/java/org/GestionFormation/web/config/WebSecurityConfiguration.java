/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.config;

import org.GestionFormation.dao.UtilisateurRepository;
import org.GestionFormation.entities.Utilisateur;
import org.GestionFormation.metier.UtilisateurMetier;
import org.GestionFormation.web.config.appUser.AppUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author Ayoub
 */
@Configuration
public class WebSecurityConfiguration extends GlobalAuthenticationConfigurerAdapter 
{
    @Autowired
    private AppUserDetailsService appUserDetailsService;
    
    
    
  @Override
  public void init(AuthenticationManagerBuilder auth) throws Exception 
  {
        auth.userDetailsService(appUserDetailsService);
  }
  
//  @Bean
//  UserDetailsService userDetailsService() 
//  {
//    return new UserDetailsService() {
//
//      @Override
//      public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException 
//      {
//        Utilisateur user = utilisateurRepository.findFirstByOrderByEmailUtilisateurAsc();
//        
//        if(account != null) 
//        {
//            return new User(account.getUsername(), account.getPassword(), true, true, true, true,
//                AuthorityUtils.createAuthorityList("USER"));
//        }
//        else 
//        {
//          throw new UsernameNotFoundException("could not find the user '"
//                  + username + "'");
//        }
//      }
//      
//    };
  
}
