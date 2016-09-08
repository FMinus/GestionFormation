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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



/**
 *
 * @author Ayoub
 */
@Entity
public class ResponsableFormation implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @Id
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ResponsableFormation_ID")
    private Utilisateur ResponsableFormation;
    
    @OneToMany(mappedBy = "responsableFormation",fetch = FetchType.LAZY)
    private Collection<Formation> formations;

    public ResponsableFormation()
    {
    }

    public ResponsableFormation(Utilisateur ResponsableFormation, Collection<Formation> formations)
    {
        this.ResponsableFormation = ResponsableFormation;
        this.formations = formations;
    }

    public Utilisateur getResponsableFormation()
    {
        return ResponsableFormation;
    }

    public void setResponsableFormation(Utilisateur ResponsableFormation)
    {
        this.ResponsableFormation = ResponsableFormation;
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
        return "ResponsableFormation{" + "ResponsableFormation=" + ResponsableFormation + ", formations=" + formations + '}';
    }

    
    
    
}
