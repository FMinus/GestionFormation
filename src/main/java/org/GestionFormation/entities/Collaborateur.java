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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Collaborateur implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long idC;
            
    
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="Collaborateur_ID")
    private Utilisateur collaborateur;
    
    @ManyToMany(mappedBy = "collaborateurs",fetch = FetchType.LAZY)
    private Collection<Formation> formations;
    
    @OneToMany(mappedBy = "collaborateur",fetch = FetchType.LAZY)
    private Collection<EvaluationFormation> evaluationFormations;
    
    private boolean confirmationInscription = false;
    
    public Collaborateur()
    {
    }

    public Collaborateur(Utilisateur collaborateur, Collection<Formation> formations, Collection<EvaluationFormation> evaluationFormations)
    {
        this.collaborateur = collaborateur;
        this.formations = formations;
        this.evaluationFormations = evaluationFormations;
    }

    public Utilisateur getCollaborateur()
    {
        return collaborateur;
    }
    
    @JsonSetter
    public void setCollaborateur(Utilisateur collaborateur)
    {
        this.collaborateur = collaborateur;
    }

    public Long getIdCollaborateur()
    {
        return idC;
    }

    public void setIdCollaborateur(Long id)
    {
        this.idC = id;
    }
    
    

    public boolean isConfirmationInscription()
    {
        return confirmationInscription;
    }

    public void setConfirmationInscription(boolean confirmationInscription)
    {
        this.confirmationInscription = confirmationInscription;
    }
    
    @JsonIgnore
    public Collection<EvaluationFormation> getEvaluationFormations()
    {
        return evaluationFormations;
    }

    @JsonSetter
    public void setEvaluationFormations(Collection<EvaluationFormation> evaluationFormations)
    {
        this.evaluationFormations = evaluationFormations;
    }
    
    
    @JsonIgnore
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
        return "Collaborateur{" + "collaborateur=" + collaborateur + ", formations=" + formations + ", evaluationFormations=" + evaluationFormations + ", confirmationInscription=" + confirmationInscription + '}';
    }
    
}
