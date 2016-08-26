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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Ayoub
 */
@Entity
public class Formation implements Serializable
{ 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormation;
    
    @NotNull
    private String nomFormation;
    
    private String Description;
    
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFormation;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODE_RESP")
    private ResponsableFormation responsableFormation;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "COLLABORATEUR_FORMATION",
            joinColumns = @JoinColumn(name="formation_id"),
            inverseJoinColumns=@JoinColumn(name="collaborateur_id")
            )
    private Collection<Collaborateur> collaborateurs;
    
    
    @OneToMany(mappedBy = "formation",fetch = FetchType.LAZY)
    private Collection<SessionFormation> sessionFormations;
    
    @OneToMany(mappedBy = "formation",fetch = FetchType.LAZY)
    private Collection<EvaluationFormation> evaluationFormations;
     
    public Formation()
    {
    }
    
    
    public Formation(String nomFormation, String Description, Date dateFormation, ResponsableFormation responsableFormation, Collection<Collaborateur> collaborateurs)
    {
        this.nomFormation = nomFormation;
        this.Description = Description;
        this.dateFormation = dateFormation;
        this.responsableFormation = responsableFormation;
        this.collaborateurs = collaborateurs;
       
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
    
    
    public Long getIdFormation()
    {
        return idFormation;
    }

    public void setIdFormation(Long idFormation)
    {
        this.idFormation = idFormation;
    }

    public String getNomFormation()
    {
        return nomFormation;
    }
    
    public void setNomFormation(String nomFormation)
    {
        this.nomFormation = nomFormation;
    }

    public String getDescription()
    {
        return Description;
    }

    public void setDescription(String Description)
    {
        this.Description = Description;
    }

    public Date getDateFormation()
    {
        return dateFormation;
    }

    public void setDateFormation(Date dateFormation)
    {
        this.dateFormation = dateFormation;
    }
    
    @JsonIgnore
    public ResponsableFormation getResponsableFormation()
    {
        return responsableFormation;
    }
    
    @JsonSetter
    public void setResponsableFormation(ResponsableFormation responsableFormation)
    {
        this.responsableFormation = responsableFormation;
    }
    
    @JsonIgnore
    public Collection<Collaborateur> getCollaborateurs()
    {
        return collaborateurs;
    }
    
    @JsonSetter
    public void setCollaborateurs(Collection<Collaborateur> collaborateurs)
    {
        this.collaborateurs = collaborateurs;
    }

    public Collection<EvaluationFormation> getEvaluationFormations()
    {
        return evaluationFormations;
    }

    public void setEvaluationFormations(Collection<EvaluationFormation> evaluationFormations)
    {
        this.evaluationFormations = evaluationFormations;
    }
    
    

    @Override
    public String toString()
    {
        return "Formation{" + "idFormation=" + idFormation + ", nomFormation=" + nomFormation + ", Description=" + Description + ", dateFormation=" + dateFormation + ", responsableFormation=" + responsableFormation + ", collaborateurs=" + collaborateurs + "}";
    }
    
    
    
}
