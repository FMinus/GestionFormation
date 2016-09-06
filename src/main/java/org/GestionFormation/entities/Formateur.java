/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;


@Entity
@DiscriminatorValue("FORMATEUR")
public class Formateur extends Utilisateur implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @OneToMany(mappedBy = "formateur",fetch = FetchType.LAZY)
    private Collection<SessionFormation> sessionFormations;
    
    
    public Formateur()
    {
    }

    public Formateur(Collection<SessionFormation> sessionFormations, String nomUtilisateur, String prenomUtilisateur, String emailUtilisateur, String passwordUtilisateur, Date joinDate, Collection<RoleUtilisateur> roles)
    {
        super(nomUtilisateur, prenomUtilisateur, emailUtilisateur, passwordUtilisateur, joinDate, roles);
        this.sessionFormations = sessionFormations;
    }

    
    @JsonIgnore
    public Collection<SessionFormation> getSessionFormations()
    {
        return sessionFormations;
    }
    
    @JsonSetter
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
