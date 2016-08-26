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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("COLLABORATEUR") 
public class Collaborateur extends Utilisateur implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @ManyToMany(mappedBy = "collaborateurs",fetch = FetchType.LAZY)
    private Collection<Formation> formations;
    
    @OneToMany(mappedBy = "collaborateur",fetch = FetchType.LAZY)
    private Collection<EvaluationFormation> evaluationFormations;
    
    private boolean confirmationInscription = false;
    
    public Collaborateur()
    {
    }

    public Collaborateur(Collection<Formation> formations, String nomUtilisateur, String prenomUtilisateur, Date joinDate, String passwordUtilisateur, String emailUtilisateur)
    {
        super(nomUtilisateur, prenomUtilisateur, joinDate, passwordUtilisateur, emailUtilisateur);
        this.formations = formations;
    }

    public boolean isConfirmationInscription()
    {
        return confirmationInscription;
    }

    public void setConfirmationInscription(boolean confirmationInscription)
    {
        this.confirmationInscription = confirmationInscription;
    }
    
    
    //@JsonIgnore
    public Collection<Formation> getFormations()
    {
        return formations;
    }
    
    @JsonSetter
    public void setFormations(Collection<Formation> formations)
    {
        this.formations = formations;
    }

    @Override
    public String toString()
    {
        return "Collaborateur{" + "formations=" + formations + ", confirmationInscription=" + confirmationInscription + '}';
    }

    
    
    
}
