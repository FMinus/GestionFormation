/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 *
 * @author Ayoub
 */
@Entity
//@DiscriminatorValue("FORMATEUR")
public class Formateur extends Utilisateur implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @OneToMany(mappedBy = "formateur",fetch = FetchType.LAZY)
    private Collection<SessionFormation> sessionFormations;
    
    
    public Formateur()
    {
    }

    public Formateur(Collection<SessionFormation> sessionFormations, String nomUtilisateur, String prenomUtilisateur, Date joinDate, String passwordUtilisateur, String emailUtilisateur)
    {
        super(nomUtilisateur, prenomUtilisateur, joinDate, passwordUtilisateur, emailUtilisateur);
        this.sessionFormations = sessionFormations;
    }

    public Collection<SessionFormation> getSessionFormations()
    {
        return sessionFormations;
    }

    public void setSessionFormations(Collection<SessionFormation> sessionFormations)
    {
        this.sessionFormations = sessionFormations;
    }

    @Override
    public String toString()
    {
        super.toString();
        return "Formateur{" + "sessionFormations=" + sessionFormations + '}';
    }
    
    

   

   
   
    
}
