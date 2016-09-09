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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Formateur implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idF;
    
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Formateur_ID")
    private Utilisateur formateur;
    
    @OneToMany(mappedBy = "formateur",fetch = FetchType.LAZY)
    private Collection<SessionFormation> sessionFormations;
    
    
    public Formateur()
    {
    }

    public Formateur(Utilisateur formateur, Collection<SessionFormation> sessionFormations)
    {
        this.formateur = formateur;
        this.sessionFormations = sessionFormations;
    }

    public Utilisateur getFormateur()
    {
        return formateur;
    }

    public void setFormateur(Utilisateur formateur)
    {
        this.formateur = formateur;
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

    public Long getIdF()
    {
        return idF;
    }

    public void setIdF(Long idF)
    {
        this.idF = idF;
    }

    @Override
    public String toString()
    {
        return "Formateur{" + "idFormateur=" + idF + ", formateur=" + formateur + ", sessionFormations=" + sessionFormations + '}';
    }

    
}
