/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="COLLABORATEUR")
public class Collaborateur extends Staff
{
    @ManyToMany(mappedBy = "collaborateurs",fetch = FetchType.LAZY)
    private Collection<Formation> formations;

    public Collaborateur()
    {
    }

    public Collaborateur(Collection<Formation> formations, String nom, String prenom, Date joinDate)
    {
        super(nom, prenom, joinDate);
        this.formations = formations;
    }

    public Collection<Formation> getFormations()
    {
        return formations;
    }

    public void setFormations(Collection<Formation> formations)
    {
        this.formations = formations;
    }

    @Override
    public String toString()
    {
        super.toString();
        return "Collaborateur{" + "formations=" + formations + '}';
    }
    
    
}
