/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package org.GestionFormation.mail;

import java.util.Date;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.GestionFormation.entities.Utilisateur;
import org.GestionFormation.web.mail.ConfirmerInscription;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Ayoub
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTest
{
    @Autowired
    private ConfirmerInscription confirmerInscription;
    
    @Test
    public void testSend()
    {
        assert(confirmerInscription!=null);
        
        Utilisateur user = new Utilisateur("ayoub", "deqqaq", "ayoub.deqqaq@gmail.com", "", new Date(), null);
        
        assert(user.getEmailUtilisateur()!=null);
        assert(user.getNomUtilisateur()!=null);
        assert(user.getPrenomUtilisateur()!=null);
        
        confirmerInscription.confirmerInscription(user);
    }
    
    @Test
    public void testSend2() throws MessagingException
    {
        
        
        Utilisateur user = new Utilisateur("ayoub", "deqqaq", "ayoub.deqqaq@gmail.com", "", new Date(), null);
        
        assert(user.getEmailUtilisateur()!=null);
        assert(user.getNomUtilisateur()!=null);
        assert(user.getPrenomUtilisateur()!=null);
        
        JavaMailSenderImpl sender = new JavaMailSenderImpl();
        sender.setHost("mail.host.com");
        
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        
        helper.setTo(user.getEmailUtilisateur());
        helper.setText("Thank you for ordering!");
        
        sender.send(message);
    }
}
