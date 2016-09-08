/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.mail;

import org.GestionFormation.entities.Utilisateur;

/**
 *
 * @author Ayoub
 */
public interface ConfirmerInscription
{
    public void confirmerInscription(Utilisateur user);
}
