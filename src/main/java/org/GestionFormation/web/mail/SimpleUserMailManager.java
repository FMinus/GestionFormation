/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package org.GestionFormation.web.mail;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.GestionFormation.entities.Utilisateur;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;

/**
 *
 * @author Ayoub
 */
public class SimpleUserMailManager implements ConfirmerInscription
{
    private JavaMailSender mailSender;
    
    public void setMailSender(JavaMailSender mailSender)
    {
        this.mailSender = mailSender;
    }
    
    @Override
    public void confirmerInscription(Utilisateur user)
    {
        MimeMessagePreparator preparator = new MimeMessagePreparator() 
        {
            
            public void prepare(MimeMessage mimeMessage) throws Exception 
            {
                
                mimeMessage.setRecipient(Message.RecipientType.TO,new InternetAddress(user.getEmailUtilisateur()));
                
                mimeMessage.setFrom(new InternetAddress("mail@mycompany.com"));
                mimeMessage.setText(
                        "Dear " + user.getNomUtilisateur() + " " + user.getPrenomUtilisateur()
                                + ", thank you subscribing. "
                );
            }
        };
        
        try 
        {
            this.mailSender.send(preparator);
        }
        catch (MailException ex) 
        {
            // simply log it and go on...
            System.err.println(ex.getMessage());
        }
    }
    
}
