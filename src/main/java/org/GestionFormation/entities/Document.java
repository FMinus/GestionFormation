/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Ayoub
 */
@Entity
public class Document implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDocument;
    
    private String nomDocument;
    
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateAjout;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODE_SESSION")
    private SessionFormation sessionFormation;

    public Document()
    {
    }

    public Document(String nomDocument, Date dateAjout, SessionFormation sessionFormation)
    {
        this.nomDocument = nomDocument;
        this.dateAjout = dateAjout;
        this.sessionFormation = sessionFormation;
    }

    public Long getIdDocument()
    {
        return idDocument;
    }

    public void setIdDocument(Long idDocument)
    {
        this.idDocument = idDocument;
    }

    public String getNomDocument()
    {
        return nomDocument;
    }

    public void setNomDocument(String nomDocument)
    {
        this.nomDocument = nomDocument;
    }

    public Date getDateAjout()
    {
        return dateAjout;
    }

    public void setDateAjout(Date dateAjout)
    {
        this.dateAjout = dateAjout;
    }
    
    @JsonIgnore
    public SessionFormation getSessionFormation()
    {
        return sessionFormation;
    }
    
    @JsonSetter
    public void setSessionFormation(SessionFormation sessionFormation)
    {
        this.sessionFormation = sessionFormation;
    }

    @Override
    public String toString()
    {
        return "Document{" + "idDocument=" + idDocument + ", nomDocument=" + nomDocument + ", dateAjout=" + dateAjout + ", sessionFormation=" + sessionFormation + '}';
    }
    
    
}
