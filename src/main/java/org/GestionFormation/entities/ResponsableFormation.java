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
import javax.persistence.OneToMany;

/**
 *
 * @author Ayoub
 */
@Entity
//@DiscriminatorValue("RESPONSABLEFORMATION")
public class ResponsableFormation extends Utilisateur implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @OneToMany(mappedBy = "responsableFormation",fetch = FetchType.LAZY)
    private Collection<Formation> formations;

    public ResponsableFormation()
    {
    }

    public ResponsableFormation(Collection<Formation> formations, String nomUtilisateur, String prenomUtilisateur, Date joinDate, String passwordUtilisateur, String emailUtilisateur)
    {
        super(nomUtilisateur, prenomUtilisateur, joinDate, passwordUtilisateur, emailUtilisateur);
        this.formations = formations;
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
        super.toString();
        return "ResponsableFormation{" + "formations=" + formations + '}';
    }
    
    
}
