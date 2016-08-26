/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Ayoub
 */
@Entity
//@DiscriminatorValue("ADMINISTRATEUR" )
public class Administrateur extends Utilisateur implements Serializable
{

    public Administrateur()
    {
    }

    public Administrateur(String nomUtilisateur, String prenomUtilisateur, Date joinDate, String passwordUtilisateur, String emailUtilisateur)
    {
        super(nomUtilisateur, prenomUtilisateur, joinDate, passwordUtilisateur, emailUtilisateur);
    }

    

    @Override
    public String toString()
    {
        super.toString();
        return "Administrateur{" + '}';
    }
    
    
    
}
