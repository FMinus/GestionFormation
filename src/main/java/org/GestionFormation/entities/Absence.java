/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import java.io.Serializable;
import javax.persistence.Entity;
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
    
     
    @ManyToOne
    @JoinColumn(name = "CODE_COLABORATEUR")
    private Collaborateur collaborateur;
    
    @ManyToOne
    @JoinColumn(name = "CODE_SESSIONFORMATION")
    private SessionFormation sessionFormation;

    public Absence()
    {
    }

    public Absence(Collaborateur collaborateur, SessionFormation sessionFormation)
    {
        this.collaborateur = collaborateur;
        this.sessionFormation = sessionFormation;
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

    @Override
    public String toString()
    {
        return "Absence{" + "idAbsence=" + idAbsence + ", collaborateur=" + collaborateur + ", sessionFormation=" + sessionFormation + '}';
    }
    
    
}
