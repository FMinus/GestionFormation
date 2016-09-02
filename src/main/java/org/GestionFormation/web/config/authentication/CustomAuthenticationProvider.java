
package org.GestionFormation.web.config.authentication;

import java.util.ArrayList;
import java.util.List;
import org.GestionFormation.entities.Utilisateur;
import org.GestionFormation.metier.UtilisateurMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;


@Component
public class CustomAuthenticationProvider implements AuthenticationProvider
{
    @Autowired
    private UtilisateurMetier utilisateurMetier;

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
        
        Utilisateur utilisateur = utilisateurMetier.login(name, password);
        
        if (utilisateur!=null) 
        {
            List<GrantedAuthority> grantedAuths = new ArrayList<>();
            
            grantedAuths.add(new SimpleGrantedAuthority("ROLE_UTILISATEUR"));
            //grantedAuths.add(new SimpleGrantedAuthority("ROLE_ADMINISTRATEUR"));
            
            Authentication auth = new UsernamePasswordAuthenticationToken(name, password, grantedAuths);
            return auth;
        } 
        else 
        {
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
    
    protected List<GrantedAuthority> loadUserAuthorities(String username) 
    {
        //TODO
        List<GrantedAuthority> authorities = null;
        Object[] params = { username };
        //authorities = authoritiesByUsernameMapping.execute(params); // Query to get Authorities
        return authorities;      
    }
    
}
