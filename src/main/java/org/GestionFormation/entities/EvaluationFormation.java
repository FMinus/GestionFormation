/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
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
    @GeneratedValue
    private Long idEvaliationFormation;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idCollaborateur")
    private Collaborateur collaborateur;
    
    @ManyToOne(fetch = FetchType.EAGER)
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

    public void setIdEvaliationFormation(Long idEvaliationFormation)
    {
        this.idEvaliationFormation = idEvaliationFormation;
    }

    public Collaborateur getCollaborateur()
    {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur)
    {
        this.collaborateur = collaborateur;
    }

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
