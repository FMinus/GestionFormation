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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Ayoub
 */
@Entity
public class Absence implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAbsence;
    
     
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODE_COLABORATEUR")
    private Collaborateur collaborateur;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODE_SESSIONFORMATION")
    private SessionFormation sessionFormation;
    
    private boolean isPresent;

    public Absence()
    {
    }

    public Absence(Collaborateur collaborateur, SessionFormation sessionFormation,boolean isPresent)
    {
        this.collaborateur = collaborateur;
        this.sessionFormation = sessionFormation;
        this.isPresent = isPresent;
    }
    
    
    public Long getIdAbsence()
    {
        return idAbsence;
    }

    public void setIdAbsence(Long idAbsence)
    {
        this.idAbsence = idAbsence;
    }

    public Collaborateur getCollaborateur()
    {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur)
    {
        this.collaborateur = collaborateur;
    }

    public SessionFormation getSessionFormation()
    {
        return sessionFormation;
    }

    public void setSessionFormation(SessionFormation sessionFormation)
    {
        this.sessionFormation = sessionFormation;
    }

    public boolean isIsPresent()
    {
        return isPresent;
    }

    public void setIsPresent(boolean isPresent)
    {
        this.isPresent = isPresent;
    }
    
    
    @Override
    public String toString()
    {
        return "Absence{" + "idAbsence=" + idAbsence + ", collaborateur=" + collaborateur + ", sessionFormation=" + sessionFormation + '}';
    }
    
    
}
