/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Ayoub
 */
@Entity
@Table(name="ADMINISTRATEUR")
public class Administrateur extends Staff
{

    public Administrateur()
    {
    }

    public Administrateur(String nom, String prenom, Date joinDate)
    {
        super(nom, prenom, joinDate);
    }

    @Override
    public String toString()
    {
        super.toString();
        return "Administrateur{" + '}';
    }
    
    
    
}
