/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package org.GestionFormation.web.DeploymentTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.GestionFormation.entities.RoleUtilisateur;
import org.GestionFormation.entities.Utilisateur;
import org.GestionFormation.metier.CollaborateurMetier;
import org.GestionFormation.metier.FormateurMetier;
import org.GestionFormation.metier.ResponsableFormationMetier;
import org.GestionFormation.metier.RoleUtilisateurMetier;
import org.GestionFormation.metier.UtilisateurMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ayoub
 */
@Service
@Transactional
public class UserAccountPopulateMetier implements UserAccountPopulate
{
    private String baseName = "user";
    private String baseEmailCred = "@mail.com";
    private String basePassword = "123";
    private String[] roleNames = {"ADMIN","USER","TESTER","MOD"};
    
    @Autowired
    private UtilisateurMetier utilisateurMetier;
    
    @Autowired
    private RoleUtilisateurMetier roleUtilisateurMetier;
    
    @Autowired
    private CollaborateurMetier collaborateurMetier;
    
    @Autowired
    private FormateurMetier formateurMetier;
    
    @Autowired
    private ResponsableFormationMetier responsableFormationMetier;
    
    
    @Override
    public void createRoles()
    {
        RoleUtilisateur admin = new RoleUtilisateur(roleNames[0], "tous les droits");
        RoleUtilisateur user = new RoleUtilisateur(roleNames[1], "aucun droit");
        RoleUtilisateur tester = new RoleUtilisateur(roleNames[2], "test fonctionalités");
        RoleUtilisateur mod = new RoleUtilisateur(roleNames[3], "modérateur");
        
        roleUtilisateurMetier.saveRoleUtilisateur(mod);
        roleUtilisateurMetier.saveRoleUtilisateur(admin);
        roleUtilisateurMetier.saveRoleUtilisateur(user);
        roleUtilisateurMetier.saveRoleUtilisateur(tester);
    }
    
    @Override
    public void createUsers()
    {
        RoleUtilisateur adminRole = roleUtilisateurMetier.findRoleUtilisateurByName(roleNames[0]);
        RoleUtilisateur userRole = roleUtilisateurMetier.findRoleUtilisateurByName(roleNames[1]);
        RoleUtilisateur testerRole = roleUtilisateurMetier.findRoleUtilisateurByName(roleNames[2]);
        RoleUtilisateur modRole = roleUtilisateurMetier.findRoleUtilisateurByName(roleNames[3]);
        
        if(adminRole == null || userRole == null || testerRole == null || modRole == null)
        {
            createRoles();
            adminRole = roleUtilisateurMetier.findRoleUtilisateurByName(roleNames[0]);
            userRole = roleUtilisateurMetier.findRoleUtilisateurByName(roleNames[1]);
            testerRole = roleUtilisateurMetier.findRoleUtilisateurByName(roleNames[2]);
            modRole = roleUtilisateurMetier.findRoleUtilisateurByName(roleNames[3]);
        }
        
        Utilisateur user;
        
        List<RoleUtilisateur> listRoles = new ArrayList<>();
        
        
        //create admins************************************
        listRoles.add(adminRole);
        listRoles.add(userRole);
        listRoles.add(testerRole);
        listRoles.add(modRole);
        for(int i=1;i<=5;i++)
        {
            user= new Utilisateur(baseName+i+"nomAdmin", baseEmailCred+i+"prenomAdmin", baseName+i+"Admin"+baseEmailCred, basePassword, new Date(), listRoles);
            utilisateurMetier.saveUtilisateur(user);
        }
        listRoles.clear();
        
        
        //create users************************************
        listRoles.add(userRole);
        for(int i=1;i<=20;i++)
        {
            user= new Utilisateur(baseName+i+"nomUser", baseEmailCred+i+"prenomUser", baseName+i+"User"+baseEmailCred, basePassword, new Date(), listRoles);
            utilisateurMetier.saveUtilisateur(user);
        }
        listRoles.clear();
        
        
        //create testers************************************
        listRoles.add(testerRole);
        for(int i=1;i<=5;i++)
        {
            user= new Utilisateur(baseName+i+"nomTester", baseEmailCred+i+"prenomTester", baseName+i+"Tester"+baseEmailCred, basePassword, new Date(), listRoles);
            utilisateurMetier.saveUtilisateur(user);
        }
        listRoles.clear();
        
        
        //create Mods************************************
        listRoles.add(modRole);
        for(int i=1;i<=5;i++)
        {
            user= new Utilisateur(baseName+i+"nomMods", baseEmailCred+i+"prenomMods", baseName+i+"Mods"+baseEmailCred, basePassword, new Date(), listRoles);
            utilisateurMetier.saveUtilisateur(user);
        }
        listRoles.clear();
    }
}
