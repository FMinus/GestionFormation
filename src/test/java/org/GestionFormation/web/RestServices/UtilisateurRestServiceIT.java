/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.RestServices;

import java.security.Principal;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.GestionFormation.entities.RoleUtilisateur;
import org.GestionFormation.entities.Utilisateur;
import org.GestionFormation.web.models.Result;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.data.domain.Page;

/**
 *
 * @author Ayoub
 */
public class UtilisateurRestServiceIT
{
    
    public UtilisateurRestServiceIT()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of saveUtilisateur method, of class UtilisateurRestService.
     */
    @Test
    public void testSaveUtilisateur()
    {
        System.out.println("saveUtilisateur");
        Utilisateur u = null;
        UtilisateurRestService instance = new UtilisateurRestService();
        Utilisateur expResult = null;
        Utilisateur result = instance.saveUtilisateur(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listUtilisateurs method, of class UtilisateurRestService.
     */
    @Test
    public void testListUtilisateurs_0args()
    {
        System.out.println("listUtilisateurs");
        UtilisateurRestService instance = new UtilisateurRestService();
        List<Utilisateur> expResult = null;
        List<Utilisateur> result = instance.listUtilisateurs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listUtilisateursOnly method, of class UtilisateurRestService.
     */
    @Test
    public void testListUtilisateursOnly()
    {
        System.out.println("listUtilisateursOnly");
        UtilisateurRestService instance = new UtilisateurRestService();
        List<Utilisateur> expResult = null;
        List<Utilisateur> result = instance.listUtilisateursOnly();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUtilisateur method, of class UtilisateurRestService.
     */
    @Test
    public void testGetUtilisateur_Long()
    {
        System.out.println("getUtilisateur");
        Long id = null;
        UtilisateurRestService instance = new UtilisateurRestService();
        Utilisateur expResult = null;
        Utilisateur result = instance.getUtilisateur(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUtilisateur method, of class UtilisateurRestService.
     */
    @Test
    public void testGetUtilisateur_Utilisateur()
    {
        System.out.println("getUtilisateur");
        Utilisateur utilisateur = null;
        UtilisateurRestService instance = new UtilisateurRestService();
        Utilisateur expResult = null;
        Utilisateur result = instance.getUtilisateur(utilisateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUtilisateurByFullName method, of class UtilisateurRestService.
     */
    @Test
    public void testGetUtilisateurByFullName()
    {
        System.out.println("getUtilisateurByFullName");
        String prenom = "";
        String nom = "";
        UtilisateurRestService instance = new UtilisateurRestService();
        List<Utilisateur> expResult = null;
        List<Utilisateur> result = instance.getUtilisateurByFullName(prenom, nom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listUtilisateurs method, of class UtilisateurRestService.
     */
    @Test
    public void testListUtilisateurs_int_int()
    {
        System.out.println("listUtilisateurs");
        int page = 0;
        int size = 0;
        UtilisateurRestService instance = new UtilisateurRestService();
        Page<Utilisateur> expResult = null;
        Page<Utilisateur> result = instance.listUtilisateurs(page, size);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pageUtilisateursOnly method, of class UtilisateurRestService.
     */
    @Test
    public void testPageUtilisateursOnly()
    {
        System.out.println("pageUtilisateursOnly");
        String mc = "";
        int page = 0;
        int size = 0;
        UtilisateurRestService instance = new UtilisateurRestService();
        Page<Utilisateur> expResult = null;
        Page<Utilisateur> result = instance.pageUtilisateursOnly(mc, page, size);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class UtilisateurRestService.
     */
    @Test
    public void testLogin()
    {
        System.out.println("login");
        Utilisateur utilisateur = null;
        UtilisateurRestService instance = new UtilisateurRestService();
        Result expResult = null;
        Result result = instance.login(utilisateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentUser method, of class UtilisateurRestService.
     */
    @Test
    public void testGetCurrentUser()
    {
        System.out.println("getCurrentUser");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        UtilisateurRestService instance = new UtilisateurRestService();
        String expResult = "";
        String result = instance.getCurrentUser(request, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of helloUser method, of class UtilisateurRestService.
     */
    @Test
    public void testHelloUser()
    {
        System.out.println("helloUser");
        Principal principal = null;
        UtilisateurRestService instance = new UtilisateurRestService();
        Map<String, String> expResult = null;
        Map<String, String> result = instance.helloUser(principal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class UtilisateurRestService.
     */
    @Test
    public void testLogout()
    {
        System.out.println("logout");
        HttpSession session = null;
        UtilisateurRestService instance = new UtilisateurRestService();
        instance.logout(session);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of user method, of class UtilisateurRestService.
     */
    @Test
    public void testUser()
    {
        System.out.println("user");
        Principal user = null;
        UtilisateurRestService instance = new UtilisateurRestService();
        Principal expResult = null;
        Principal result = instance.user(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoles method, of class UtilisateurRestService.
     */
    @Test
    public void testGetRoles()
    {
        System.out.println("getRoles");
        Long idUser = null;
        UtilisateurRestService instance = new UtilisateurRestService();
        List<RoleUtilisateur> expResult = null;
        List<RoleUtilisateur> result = instance.getRoles(idUser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRoleToUser method, of class UtilisateurRestService.
     */
    @Test
    public void testAddRoleToUser()
    {
        System.out.println("addRoleToUser");
        Utilisateur u = null;
        UtilisateurRestService instance = new UtilisateurRestService();
        Utilisateur expResult = null;
        Utilisateur result = instance.addRoleToUser(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
