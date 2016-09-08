/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import java.util.Date;
import org.GestionFormation.entities.Administrateur;
import org.GestionFormation.entities.Utilisateur;
import org.GestionFormation.metier.AdministrateurMetier;
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
public class AdministrateurRepositoryTest
{
    @Autowired
    private AdministrateurMetier administrateurMetier;
    
    @Test
    public void addUsers()
    {
        Administrateur u1 = new Administrateur("user1nomTest", "user1prenomTest", "user1Test@mail.com", "123", new Date(), null) {};
        Administrateur u2 = new Administrateur("user2nomTest", "user2prenomTest", "user2Test@mail.com", "123", new Date(), null) {};
        Administrateur u3 = new Administrateur("user3nomTest", "user3prenomTest", "user3Test@mail.com", "123", new Date(), null) {};
        
        
        assert(administrateurMetier.saveAdministrateur(u1)!=null);
        assert(administrateurMetier.saveAdministrateur(u2)!=null);
        assert(administrateurMetier.saveAdministrateur(u3)!=null);
        
//        Utilisateur u1_ret = utilisateurMetier.findByEmail(u1.getEmailUtilisateur());
//        Utilisateur u2_ret = utilisateurMetier.findByEmail(u2.getEmailUtilisateur());
//        Utilisateur u3_ret = utilisateurMetier.findByEmail(u3.getEmailUtilisateur());
//        
//        System.out.println("user :"+u1_ret);
//        
//        assert(u1_ret != null);
//        assert(u2_ret != null);
//        assert(u3_ret != null);
        
    }
}
