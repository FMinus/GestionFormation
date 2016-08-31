/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.config.toDelete.appUser;

import org.GestionFormation.dao.UtilisateurRepository;
import org.GestionFormation.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ayoub
 */
@Service
public class AppUserDetailsService // implements UserDetailsService
{
//    @Autowired
//    private UtilisateurRepository utilisateurRepository;
//
//    
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException
//    {
//        Utilisateur user = utilisateurRepository.findFirstByOrderByEmailUtilisateurAsc(email);
//        System.out.println("execution app user repository");
//        if (user == null) 
//            throw new UsernameNotFoundException(String.format("login [%s] inexistant", email));
//	
//        
//	// on rend les détails de l'utilsateur
//	return new AppUserDetails(user);
//        
//        
//    }
    
    
}
