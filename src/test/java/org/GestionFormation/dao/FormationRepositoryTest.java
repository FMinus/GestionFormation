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
    private UtilisateurRepository utilisateurRepository;
    
    @Autowired
    private FormateurRepository formateurRepository;
    
    String formName = "formationTest";
    String colab1Name = "user1nom";
    
    @Test
    public void ajoutFormationSimple()
    {
        
        Formation f = new Formation(formName, "", new Date(), null, null);
        
        formationMetier.saveFormation(f);
        
        Formation f_ret = formationMetier.findFormationByName(formName);
        
        assert(f_ret != null);
    }
    
    @Test
    @Transactional
    public void ajoutCollabsFormation()
    {
        Formation f = new Formation(formName, "", new Date(), null, null);
        List<Formation> listF = new ArrayList<>();
        listF.add(f);
        
        Collaborateur c1 = new Collaborateur(listF, null, colab1Name, "user1prenom", "user1@mail.com", "123", new Date(), null);
        Collaborateur c2 = new Collaborateur(listF, null, "user2nom", "user2prenom", "user2@mail.com", "123", new Date(), null);
        Collaborateur c3 = new Collaborateur(listF, null, "user3nom", "user3prenom", "user3@mail.com", "123", new Date(), null);
        
        collaborateurMetier.saveCollaborateur(c1);
        collaborateurMetier.saveCollaborateur(c2);
        collaborateurMetier.saveCollaborateur(c3);
        
        List<Collaborateur> listCol = new ArrayList<>();
        listCol.add(c1);
        listCol.add(c2);
        listCol.add(c3);
        
        f.setCollaborateurs(listCol);
        
        formationMetier.saveFormation(f);
        
        Formation f_ret = formationMetier.findOneFormationByNom(formName);
        
        assert(f_ret != null);
        assert(f_ret.getCollaborateurs() != null);
        //assert(!f_ret.getCollaborateurs().isEmpty());
                
    }
    
    @Test
    public void SupprimerByIdFormationSimple()
    {
         Formation f_ret = formationMetier.findFormationByName(formName);
        
        if(f_ret == null)
        {
            ajoutFormationSimple();
            f_ret = formationMetier.findFormationByName(formName);
        }
        
        formationMetier.deleteFormation(f_ret);
        f_ret = formationMetier.findFormationByName(formName);
        assert(f_ret == null);
        
    }
    
    @Test
    public void SupprimerByIdFormationCollabs()
    {
         Formation f_ret = formationMetier.findFormationByName(formName);
        
        if(f_ret == null)
        {
            ajoutFormationSimple();
            f_ret = formationMetier.findFormationByName(formName);
        }
        
        formationMetier.deleteFormation(f_ret);
        f_ret = formationMetier.findFormationByName(formName);
        assert(f_ret == null);
        
    }
    
    @Test
    public void SupprimerFormationCollabs()
    {
         Formation f_ret = formationMetier.findFormationByName(formName);
        if(f_ret == null)
        {
            ajoutCollabsFormation();
            f_ret = formationMetier.findFormationByName(formName);
        }
        
        formationMetier.deleteFormation(f_ret);
        f_ret = formationMetier.findFormationByName(formName);
        assert(f_ret == null);
        
    }
    
    @Test
    public void listFormationCollabs()
    {
        //Formation f_ret = formationMetier.findFormationByName("formation1");
        Formation f_ret = formationMetier.getFormations(Long.parseLong("1"));
        
        if(f_ret == null)
        {
            ajoutCollabsFormation();
            f_ret = formationMetier.getFormations(Long.parseLong("1"));            
        }
        List<Collaborateur> listC = (List<Collaborateur>) f_ret.getCollaborateurs();
        assert(f_ret.getNomFormation()==null);
        assert(listC == null);
                
        Collaborateur c = listC.get(0);
        
        assert(c.getFormations() == null); 
    }
    
    @Test
    public void findUser()
    {
        Utilisateur u = utilisateurRepository.findFirstByEmailUtilisateur("user1@mail.com");
        
        assert(u != null);
    }
    
    
    
    
    
    
}
