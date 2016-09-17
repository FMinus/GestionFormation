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
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Ayoub
 */
@Entity
public class SessionFormation implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSession;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateSession;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODE_FORMATION")
    private Formation formation;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODE_FORMATEUR")
    private Formateur formateur;
    
    @OneToMany(mappedBy = "sessionFormation",fetch = FetchType.LAZY,cascade=CascadeType.ALL, orphanRemoval=true)
    private Collection<Document> documents;
    
    @OneToMany(mappedBy = "sessionFormation",fetch = FetchType.LAZY,cascade=CascadeType.ALL, orphanRemoval=true)
    private Collection<Absence> absences;
    
    
    public SessionFormation()
    {
    }

    public SessionFormation(Date dateSession, Formation formation, Collection<Document> documents, Collection<Absence> absences)
    {
        this.dateSession = dateSession;
        this.formation = formation;
        this.documents = documents;
        this.absences = absences;
    }

    
    @JsonIgnore
    public Formation getFormation()
    {
        return formation;
    }
    
    @JsonSetter
    public void setFormation(Formation formation)
    {
        this.formation = formation;
    }
    
    
    public Long getIdSession()
    {
        return idSession;
    }

    public void setIdSession(Long idSession)
    {
        this.idSession = idSession;
    }

    public Date getDateSession()
    {
        return dateSession;
    }

    public void setDateSession(Date dateSession)
    {
        this.dateSession = dateSession;
    }
    
    @JsonIgnore
    public Collection<Document> getDocuments()
    {
        return documents;
    }
    
    @JsonSetter 
    public void setDocuments(Collection<Document> documents)
    {
        this.documents = documents;
    }
    
    @JsonIgnore
    public Collection<Absence> getAbsences()
    {
        return absences;
    }
    
    @JsonSetter 
    public void setAbsences(Collection<Absence> absences)
    {
        this.absences = absences;
    }
    
    @JsonIgnore
    public Formateur getFormateur()
    {
        return formateur;
    }
    
    @JsonSetter
    public void setFormateur(Formateur formateur)
    {
        this.formateur = formateur;
    }
    
    
    @Override
    public String toString()
    {
        return "SessionFormation{" + "idSession=" + idSession + ", dateSession=" + dateSession + ", documents=" + documents + ", absences=" + absences + '}';
    }
    
    
}
