/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Ayoub
 */
@Entity
@DiscriminatorValue("ADMINISTRATEUR" )
public class Administrateur extends Utilisateur implements Serializable
{
    private static final long serialVersionUID = 1L;

    public Administrateur()
    {
    }

    public Administrateur(String nomUtilisateur, String prenomUtilisateur, String emailUtilisateur, String passwordUtilisateur, Date joinDate, Collection<RoleUtilisateur> roles)
    {
        super(nomUtilisateur, prenomUtilisateur, emailUtilisateur, passwordUtilisateur, joinDate, roles);
    }

    

    

    @Override
    public String toString()
    {
        super.toString();
        return "Administrateur{" + '}';
    }
    
    
    
}
