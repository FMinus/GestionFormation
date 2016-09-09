/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.Size;

/**
 *
 * @author Ayoub
 */
@Entity
public class EvaluationFormation implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEvaliationFormation;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCollaborateur")
    private Collaborateur collaborateur;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idFormation")
    private Formation formation;
    
    private String revueFormation;
    
    @Size(min=1,max=5)
    private int marqueFormation;

    public EvaluationFormation()
    {
    }

    public EvaluationFormation(Collaborateur collaborateur, Formation formation, String revueFormation, int marqueFormation)
    {
        this.collaborateur = collaborateur;
        this.formation = formation;
        this.revueFormation = revueFormation;
        this.marqueFormation = marqueFormation;
    }

    public Long getIdEvaliationFormation()
    {
        return idEvaliationFormation;
    }
    
    @JsonSetter
    public void setIdEvaliationFormation(Long idEvaliationFormation)
    {
        this.idEvaliationFormation = idEvaliationFormation;
    }
    
    @JsonIgnore
    public Collaborateur getCollaborateur()
    {
        return collaborateur;
    }
    
    @JsonSetter
    public void setCollaborateur(Collaborateur collaborateur)
    {
        this.collaborateur = collaborateur;
    }
    
    @JsonIgnore
    public Formation getFormation()
    {
        return formation;
    }

    public void setFormation(Formation formation)
    {
        this.formation = formation;
    }

    public String getRevueFormation()
    {
        return revueFormation;
    }

    public void setRevueFormation(String revueFormation)
    {
        this.revueFormation = revueFormation;
    }

    public int getMarqueFormation()
    {
        return marqueFormation;
    }

    public void setMarqueFormation(int marqueFormation)
    {
        this.marqueFormation = marqueFormation;
    }

    @Override
    public String toString()
    {
        return "EvaluationFormation{" + "idEvaliationFormation=" + idEvaliationFormation + ", collaborateur=" + collaborateur + ", formation=" + formation + ", revueFormation=" + revueFormation + ", marqueFormation=" + marqueFormation + '}';
    }
    
    
    
}
