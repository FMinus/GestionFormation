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
import java.util.Objects;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_name"))
    private Collection<RoleUtilisateur> roles;
    
    public Utilisateur()
    {
    }

    public Utilisateur(String nomUtilisateur, String prenomUtilisateur, String emailUtilisateur, String passwordUtilisateur, Date joinDate, Collection<RoleUtilisateur> roles)
    {
        this.nomUtilisateur = nomUtilisateur;
        this.prenomUtilisateur = prenomUtilisateur;
        this.emailUtilisateur = emailUtilisateur;
        this.passwordUtilisateur = passwordUtilisateur;
        this.joinDate = joinDate;
        this.roles = roles;
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
    
    //@JsonIgnore
    public Collection<RoleUtilisateur> getRoles()
    {
        return roles;
    }
    
    @JsonSetter
    public void setRoles(Collection<RoleUtilisateur> roles)
    {
        this.roles = roles;
    }

    @Override
    public String toString()
    {
        return "Utilisateur{" + "idUtilisateur=" + idUtilisateur + ", nomUtilisateur=" + nomUtilisateur + ", prenomUtilisateur=" + prenomUtilisateur + ", emailUtilisateur=" + emailUtilisateur + ", passwordUtilisateur=" + passwordUtilisateur + ", joinDate=" + joinDate + ", urlPhotoUtilisateur=" + urlPhotoUtilisateur + ", roles=" + roles + '}';
    }

    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Utilisateur other = (Utilisateur) obj;
        if ( ! Objects.equals(this.nomUtilisateur, other.nomUtilisateur))
        {
            return false;
        }
        if ( ! Objects.equals(this.prenomUtilisateur, other.prenomUtilisateur))
        {
            return false;
        }
        if ( ! Objects.equals(this.emailUtilisateur, other.emailUtilisateur))
        {
            return false;
        }
        if ( ! Objects.equals(this.joinDate, other.joinDate))
        {
            return false;
        }
        return true;
    }
    
    
    

    
    
    
}
