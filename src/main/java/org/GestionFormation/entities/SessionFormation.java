/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSession;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateSession;
    
    @ManyToOne
    @JoinColumn(name = "CODE_FORMATION")
    private Formation formation;
    
    @OneToMany(mappedBy = "sessionFormation",fetch = FetchType.LAZY)
    private Collection<Document> documents;
    
    @OneToMany(mappedBy = "sessionFormation",fetch = FetchType.LAZY)
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

    

    public Formation getFormation()
    {
        return formation;
    }

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

    public Collection<Document> getDocuments()
    {
        return documents;
    }

    public void setDocuments(Collection<Document> documents)
    {
        this.documents = documents;
    }

    public Collection<Absence> getAbsences()
    {
        return absences;
    }

    public void setAbsences(Collection<Absence> absences)
    {
        this.absences = absences;
    }

    @Override
    public String toString()
    {
        return "SessionFormation{" + "idSession=" + idSession + ", dateSession=" + dateSession + ", documents=" + documents + ", absences=" + absences + '}';
    }
    
    
}
