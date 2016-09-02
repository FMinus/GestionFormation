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
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name = "ROLE",discriminatorType = DiscriminatorType.STRING )
@Table(name = "Utilisateur",uniqueConstraints=@UniqueConstraint(columnNames={"emailUtilisateur"}))
public class Utilisateur implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long idUtilisateur;
    
    @NotNull
    private String nomUtilisateur;
    
    @NotNull
    private String prenomUtilisateur;
    
    @Email
    private String emailUtilisateur;
    
    
    private String passwordUtilisateur;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date joinDate;
    
    private String urlPhotoUtilisateur="";
    
    @ManyToMany
    @JoinTable(name = "USERS_ROLES")
    private Collection<RoleUtilisateur> roles;
    
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
    
    @JsonIgnore
    public String getPasswordUtilisateur()
    {
        return passwordUtilisateur;
    }
    @JsonSetter
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

    public Collection<RoleUtilisateur> getRoles()
    {
        return roles;
    }

    public void setRoles(Collection<RoleUtilisateur> roles)
    {
        this.roles = roles;
    }

    @Override
    public String toString()
    {
        return "Utilisateur{" + "idUtilisateur=" + idUtilisateur + ", nomUtilisateur=" + nomUtilisateur + ", prenomUtilisateur=" + prenomUtilisateur + ", emailUtilisateur=" + emailUtilisateur + ", passwordUtilisateur=" + passwordUtilisateur + ", joinDate=" + joinDate + ", urlPhotoUtilisateur=" + urlPhotoUtilisateur + ", roles=" + roles + '}';
    }
    
    
    

    
    
    
}
