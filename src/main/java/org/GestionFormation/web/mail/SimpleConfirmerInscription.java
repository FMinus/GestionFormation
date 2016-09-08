/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.mail;

import org.GestionFormation.entities.Utilisateur;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ayoub
 */
@Service
public class SimpleConfirmerInscription implements ConfirmerInscription
{
    private MailSender mailSender;
    private SimpleMailMessage templateMessage;

    public void setMailSender(MailSender mailSender)
    {
        this.mailSender = mailSender;
    }

    public void setTemplateMessage(SimpleMailMessage templateMessage)
    {
        this.templateMessage = templateMessage;
    }
    
    @Override
    public void confirmerInscription(Utilisateur user)
    {
        // Do the business calculations...
        // Call the collaborators to persist the order...
        SimpleMailMessage msg = new SimpleMailMessage(this.templateMessage);
        
        msg.setTo(user.getEmailUtilisateur());
        msg.setText(
            "Dear " + user.getNomUtilisateur() + " " + user.getPrenomUtilisateur()
                + ", thank you subscribing. "
                );
        
        try
        {
            this.mailSender.send(msg);
        }
        catch (MailException ex) 
        {
            // simply log it and go on...
            System.err.println(ex.getMessage());
        }
    }
    
}
