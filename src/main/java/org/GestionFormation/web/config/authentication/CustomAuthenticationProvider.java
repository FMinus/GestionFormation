/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package org.GestionFormation.web.config.authentication;

import java.util.ArrayList;
import java.util.List;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

/**
 *
 * @author Ayoub
 */
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider
{

    public CustomAuthenticationProvider()
    {
        System.out.println("CustomAuthenticationProvider constructor called");
    }
    
    
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException
    {
        System.out.println("CustomAuthenticationProvider authenticate");
        
        String name = authentication.getName();
        String password = authentication.getCredentials().toString();
        
        System.out.println("CustomAuthenticationProvider authenticate login with : "+name+" "+password);
        if (name.equals("user") && password.equals("passwords")) {
            List<GrantedAuthority> grantedAuths = new ArrayList<>();
            
            grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
            grantedAuths.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
            
            Authentication auth = new UsernamePasswordAuthenticationToken(name, password, grantedAuths);
            return auth;
        } else {
            return null;
        }
    }
    
    @Override
    public boolean supports(Class<?> authentication)
    {
        System.out.println("CustomAuthenticationProvider supports");
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

    public void setUserDetailsService(UserDetailsService customUserDetailsService)
    {
        System.out.println("setUserDetailsService called");
    }
    
}
