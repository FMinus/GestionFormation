/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Ayoub
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Staff implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    
    @NotNull
    private String nom;
    
    @NotNull
    private String prenom;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date joinDate;

    public Staff()
    {
    }

    public Staff(String nom, String prenom, Date joinDate)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.joinDate = joinDate;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public Date getJoinDate()
    {
        return joinDate;
    }

    public void setJoinDate(Date joinDate)
    {
        this.joinDate = joinDate;
    }

    @Override
    public String toString()
    {
        return "Staff{" + "idCollaborateur=" + id + ", nom=" + nom + ", prenom=" + prenom + ", joinDate=" + joinDate + '}';
    }
    
    
}
