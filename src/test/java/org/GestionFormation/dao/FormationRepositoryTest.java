/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.GestionFormation.entities.*;
import org.GestionFormation.metier.CollaborateurMetier;
import org.GestionFormation.metier.FormationMetier;
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
public class FormationRepositoryTest
{
    @Autowired
    private FormationMetier formationMetier;
    
    @Autowired
    private CollaborateurMetier collaborateurMetier;
    
    
    
    @Autowired
    private FormateurRepository formateurRepository;
    
    @Autowired
    private UtilisateurMetier utilisateurMetier;
    
    String formName = "formationTest";
    String colab1Name = "user1nom";
    
    @Test
    @Transactional
    public void ajoutFormationSimple()
    {
        
        Formation f = new Formation(formName, "description", new Date(), null, null);
        
        formationMetier.saveFormation(f);
        
        Formation f_ret = formationMetier.findFormationByName(formName);
        
        assert(f_ret != null);
    }
    
    @Test
    @Transactional
    public void ajoutCollabsFormation()
    {
        Formation f;
        f = formationMetier.findFormationByName(formName);
        
        // Ajout Formation : 
        if(f == null)
        {
            ajoutFormationSimple();
            f = formationMetier.findFormationByName(formName);
        }
        
        //Ajout Utilisateurs
        String email_u1 = "user1Test@mail.com";
        String email_u2 = "user2Test@mail.com";
        String email_u3 = "user3Test@mail.com";
        
        Utilisateur u1_ret = utilisateurMetier.findByEmail(email_u1);
        Utilisateur u2_ret = utilisateurMetier.findByEmail(email_u2);
        Utilisateur u3_ret = utilisateurMetier.findByEmail(email_u3);
        
        if(u1_ret == null || u2_ret == null || u3_ret == null)
        {
            UtilisateursRepositoryTest repositoryTest = new UtilisateursRepositoryTest();
            repositoryTest.addUsers();
        }
        
        u1_ret = utilisateurMetier.findByEmail(email_u1);
        u2_ret = utilisateurMetier.findByEmail(email_u2);
        u3_ret = utilisateurMetier.findByEmail(email_u3);
                
        List<Formation> listF = new ArrayList<>();
        listF.add(f);
        
        //Ajout Collaborateurs : 
        Collaborateur c1 = new Collaborateur(u1_ret, listF, null);
        Collaborateur c2 = new Collaborateur(u2_ret, listF, null);
        Collaborateur c3 = new Collaborateur(u2_ret, listF, null);
        
        List<Collaborateur> listCol = new ArrayList<>();
        listCol.add(c1);
        listCol.add(c2);
        listCol.add(c3);
        
         f.setCollaborateurs(listCol);
        
        collaborateurMetier.saveCollaborateur(c1);
        collaborateurMetier.saveCollaborateur(c2);
        collaborateurMetier.saveCollaborateur(c3);
        
        
        
       
        
        formationMetier.saveFormation(f);
        
        Formation f_ret = formationMetier.findFormationByName(formName);
        
        assert(f_ret != null);
        assert(f_ret.getCollaborateurs() != null);
        assert(!f_ret.getCollaborateurs().isEmpty());
                
    }
//    
//    @Test
//    public void SupprimerByIdFormationSimple()
//    {
//         Formation f_ret = formationMetier.findFormationByName(formName);
//        
//        if(f_ret == null)
//        {
//            ajoutFormationSimple();
//            f_ret = formationMetier.findFormationByName(formName);
//        }
//        
//        formationMetier.deleteFormation(f_ret);
//        f_ret = formationMetier.findFormationByName(formName);
//        assert(f_ret == null);
//        
//    }
//    
//    @Test
//    public void SupprimerByIdFormationCollabs()
//    {
//         Formation f_ret = formationMetier.findFormationByName(formName);
//        
//        if(f_ret == null)
//        {
//            ajoutFormationSimple();
//            f_ret = formationMetier.findFormationByName(formName);
//        }
//        
//        formationMetier.deleteFormation(f_ret);
//        f_ret = formationMetier.findFormationByName(formName);
//        assert(f_ret == null);
//        
//    }
//    
//    @Test
//    public void SupprimerFormationCollabs()
//    {
//         Formation f_ret = formationMetier.findFormationByName(formName);
//        if(f_ret == null)
//        {
//            ajoutCollabsFormation();
//            f_ret = formationMetier.findFormationByName(formName);
//        }
//        
//        formationMetier.deleteFormation(f_ret);
//        f_ret = formationMetier.findFormationByName(formName);
//        assert(f_ret == null);
//        
//    }
    
//    @Test
//    public void listFormationCollabs()
//    {
//        //Formation f_ret = formationMetier.findFormationByName("formation1");
//        Formation f_ret = formationMetier.getFormation(Long.parseLong("1"));
//        
//        if(f_ret == null)
//        {
//            ajoutCollabsFormation();
//            f_ret = formationMetier.getFormation(Long.parseLong("1"));            
//        }
//        List<Collaborateur> listC = (List<Collaborateur>) f_ret.getCollaborateurs();
//        assert(f_ret.getNomFormation()==null);
//        assert(listC == null);
//                
//        Collaborateur c = listC.get(0);
//        
//        assert(c.getFormation() == null); 
//    }
//    
    
    
    
    
    
    
    
}
