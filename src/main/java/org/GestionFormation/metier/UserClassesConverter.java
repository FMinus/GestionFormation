/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.ArrayList;
import java.util.List;
import org.GestionFormation.entities.Administrateur;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Formateur;
import org.GestionFormation.entities.Formation;
import org.GestionFormation.entities.ResponsableFormation;
import org.GestionFormation.entities.Utilisateur;

/**
 *
 * @author Ayoub
 */
public class UserClassesConverter
{
    public static Collaborateur userToCollaborateur(Utilisateur u)
    {
        Collaborateur col = new Collaborateur();
        
        col.setNomUtilisateur(u.getNomUtilisateur());
        col.setPrenomUtilisateur(u.getPrenomUtilisateur());
        col.setEmailUtilisateur(u.getEmailUtilisateur());
        col.setJoinDate(u.getJoinDate());
        col.setPasswordUtilisateur(u.getPasswordUtilisateur());
        col.setUrlPhotoUtilisateur(u.getUrlPhotoUtilisateur());
        
        List<Formation> listF = new ArrayList<>();
        col.setFormations(listF);
        
        return col;
        
    }
    
     public static ResponsableFormation userToResponsableFormation(Utilisateur u)
    {
        ResponsableFormation resp = new ResponsableFormation();
        
        resp.setNomUtilisateur(u.getNomUtilisateur());
        resp.setPrenomUtilisateur(u.getPrenomUtilisateur());
        resp.setEmailUtilisateur(u.getEmailUtilisateur());
        resp.setJoinDate(u.getJoinDate());
        resp.setPasswordUtilisateur(u.getPasswordUtilisateur());
        resp.setUrlPhotoUtilisateur(u.getUrlPhotoUtilisateur());
        return resp;
        
    }
     
    public static Formateur userToFormateur(Utilisateur u)
    {
        Formateur formateur = new Formateur();
        
        formateur.setNomUtilisateur(u.getNomUtilisateur());
        formateur.setPrenomUtilisateur(u.getPrenomUtilisateur());
        formateur.setEmailUtilisateur(u.getEmailUtilisateur());
        formateur.setJoinDate(u.getJoinDate());
        formateur.setPasswordUtilisateur(u.getPasswordUtilisateur());
        formateur.setUrlPhotoUtilisateur(u.getUrlPhotoUtilisateur());
        
        return formateur;
        
    }
    
    public static Administrateur userToAdministrateur(Utilisateur u)
    {
        Administrateur admin = new Administrateur();
        
        admin.setNomUtilisateur(u.getNomUtilisateur());
        admin.setPrenomUtilisateur(u.getPrenomUtilisateur());
        admin.setEmailUtilisateur(u.getEmailUtilisateur());
        admin.setJoinDate(u.getJoinDate());
        admin.setPasswordUtilisateur(u.getPasswordUtilisateur());
        admin.setUrlPhotoUtilisateur(u.getUrlPhotoUtilisateur());
        
        return admin;
        
    }
}
