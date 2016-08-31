/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package org.GestionFormation.web.config.toDelete.handlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.GestionFormation.dao.UtilisateurRepository;
import org.GestionFormation.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

/**
 *
 * @author Ayoub
 */
public class RestAuthenticationSuccessHandler extends SimpleUrlAuthenticationFailureHandler
{
    @Autowired
    private UtilisateurRepository userService;
    
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws ServletException, IOException 
    {
         Utilisateur user = userService.findUserByEmailUtilisateur(authentication.getName());
         System.out.println("user authentification success ");
         //SecurityUtils.sendResponse(response, HttpServletResponse.SC_OK, user);
         response.sendRedirect("/app/views/index.html");     
    }
}
