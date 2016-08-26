/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Ayoub
 */
@Entity
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
//@DiscriminatorColumn( name = "ROLE",discriminatorType = DiscriminatorType.STRING )
//@Table(uniqueConstraints=@UniqueConstraint(columnNames={"emailUtilisateur"}))
@Table(name = "Utilisateur")
public class Utilisateur implements Serializable
{
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long idUtilisateur;
    
    @NotNull
    private String nomUtilisateur;
    
    @NotNull
    private String prenomUtilisateur;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date joinDate;
    
    private String urlPhotoUtilisateur="";
    
    @JsonIgnore
    private String passwordUtilisateur;
    
    @Email
    private String emailUtilisateur;
    
    public Utilisateur()
    {
    }

    public Utilisateur(String nomUtilisateur, String prenomUtilisateur, Date joinDate, String passwordUtilisateur, String emailUtilisateur)
    {
        this.nomUtilisateur = nomUtilisateur;
        this.prenomUtilisateur = prenomUtilisateur;
        this.joinDate = joinDate;
        this.passwordUtilisateur = passwordUtilisateur;
        this.emailUtilisateur = emailUtilisateur;
    }

    public Long getIdUtilisateur()
    {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Long idUtilisateur)
    {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNomUtilisateur()
    {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur)
    {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getPrenomUtilisateur()
    {
        return prenomUtilisateur;
    }

    public void setPrenomUtilisateur(String prenomUtilisateur)
    {
        this.prenomUtilisateur = prenomUtilisateur;
    }

    public Date getJoinDate()
    {
        return joinDate;
    }

    public void setJoinDate(Date joinDate)
    {
        this.joinDate = joinDate;
    }

    public String getUrlPhotoUtilisateur()
    {
        return urlPhotoUtilisateur;
    }

    public void setUrlPhotoUtilisateur(String urlPhotoUtilisateur)
    {
        this.urlPhotoUtilisateur = urlPhotoUtilisateur;
    }

    public String getPasswordUtilisateur()
    {
        return passwordUtilisateur;
    }

    public void setPasswordUtilisateur(String passwordUtilisateur)
    {
        this.passwordUtilisateur = passwordUtilisateur;
    }

    public String getEmailUtilisateur()
    {
        return emailUtilisateur;
    }

    public void setEmailUtilisateur(String emailUtilisateur)
    {
        this.emailUtilisateur = emailUtilisateur;
    }

    @Override
    public String toString()
    {
        return "Utilisateur{" + "idUtilisateur=" + idUtilisateur + ", nomUtilisateur=" + nomUtilisateur + ", prenomUtilisateur=" + prenomUtilisateur + ", joinDate=" + joinDate + ", urlPhotoUtilisateur=" + urlPhotoUtilisateur + ", passwordUtilisateur=" + passwordUtilisateur + ", emailUtilisateur=" + emailUtilisateur + '}';
    }

    
    
    
}
