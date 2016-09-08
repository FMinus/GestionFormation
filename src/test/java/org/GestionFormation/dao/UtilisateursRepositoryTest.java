/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import java.util.Date;
import org.GestionFormation.entities.Utilisateur;
import org.GestionFormation.metier.UtilisateurMetier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Ayoub
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UtilisateursRepositoryTest
{
    @Autowired
    private UtilisateurMetier utilisateurMetier;
    
    @Test
    public void addUsers()
    {
        Utilisateur u1 = new Utilisateur("user1nomTest", "user1prenomTest", "user1Test@mail.com", "123", new Date(), null);
        Utilisateur u2 = new Utilisateur("user2nomTest", "user2prenomTest", "user2Test@mail.com", "123", new Date(), null);
        Utilisateur u3 = new Utilisateur("user3nomTest", "user3prenomTest", "user3Test@mail.com", "123", new Date(), null);
        
        
        assert(utilisateurMetier.saveUtilisateur(u1)!=null);
        assert(utilisateurMetier.saveUtilisateur(u2)!=null);
        assert(utilisateurMetier.saveUtilisateur(u3)!=null);
        
        Utilisateur u1_ret = utilisateurMetier.findByEmail(u1.getEmailUtilisateur());
        Utilisateur u2_ret = utilisateurMetier.findByEmail(u2.getEmailUtilisateur());
        Utilisateur u3_ret = utilisateurMetier.findByEmail(u3.getEmailUtilisateur());
        
        System.out.println("user :"+u1_ret);
        
        assert(u1_ret != null);
        assert(u2_ret != null);
        assert(u3_ret != null);
        
    }
    
     @Test
    public void deleteUsers()
    {
        String email_u1 = "user1Test@mail.com";
        String email_u2 = "user2Test@mail.com";
        String email_u3 = "user3Test@mail.com";
        
        Utilisateur u1_ret = utilisateurMetier.findByEmail(email_u1);
        Utilisateur u2_ret = utilisateurMetier.findByEmail(email_u2);
        Utilisateur u3_ret = utilisateurMetier.findByEmail(email_u3);
        
        if(u1_ret == null || u2_ret == null || u3_ret == null)
            addUsers();
        
        u1_ret = utilisateurMetier.findByEmail(email_u1);
        u2_ret = utilisateurMetier.findByEmail(email_u2);
        u3_ret = utilisateurMetier.findByEmail(email_u3);
        
        
        
        utilisateurMetier.supprimerUtilisateur(u1_ret);
        utilisateurMetier.supprimerUtilisateur(u2_ret);
        utilisateurMetier.supprimerUtilisateur(u3_ret);
        
        assert((u1_ret = utilisateurMetier.findByEmail(email_u1))!= null);
        assert((u2_ret = utilisateurMetier.findByEmail(email_u2)) != null);
        assert((u3_ret = utilisateurMetier.findByEmail(email_u3)) != null);
        
        
    }
    
    
    
}
