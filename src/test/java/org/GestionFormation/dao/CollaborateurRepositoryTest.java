/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import java.util.List;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Utilisateur;
import org.GestionFormation.metier.CollaborateurMetier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Ayoub
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CollaborateurRepositoryTest
{
    @Autowired
    private UtilisateurRepository utilisateurRepository;
    
    @Autowired
    private CollaborateurRepository collaborateurRepository;
    
    @Autowired
    private CollaborateurMetier collaborateurMetier;
    
    @Test
    public void testDao()
    {
//        String email = "user1@mail.com";
//        
//        //assert(utilisateurRepository==null); 
//        //List<Utilisateur> collaborateur = utilisateurRepository.findCollaborateursOnly();
//        Page<Collaborateur>  collaborateur = collaborateurRepository.findCollaborateur("user1",new PageRequest(0,3));
//        
//        //System.out.println("colab : "+collaborateur.);
//        
//        for(Collaborateur c : collaborateur)
//        {
//            System.out.println(">"+c);
//        }
        
    }
    
    @Test
    public void testCollab()
    {
        String email = "user1Test@mail.com";
        
        Collaborateur c = collaborateurRepository.findByCollaborateurEmailUtilisateur(email);
        
        assert(c!=null);
        System.out.println("collab"+c.getCollaborateur().getEmailUtilisateur());
    }
}
