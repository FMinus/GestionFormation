/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Ayoub
 */
@Entity
public class RoleUtilisateur implements Serializable
{
    @Id
    private String nomRole;
    private String description;
    //private Collection<Ahthorities> listAuthorities;

    public RoleUtilisateur()
    {
    }

    public RoleUtilisateur(String nomRole, String description)
    {
        this.nomRole = nomRole;
        this.description = description;
    }

    public String getNomRole()
    {
        return nomRole;
    }

    public void setNomRole(String nomRole)
    {
        this.nomRole = nomRole;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    @Override
    public String toString()
    {
        return "RoleUtilisateur{" + "nomRole=" + nomRole + ", description=" + description + '}';
    }
    
    
}
