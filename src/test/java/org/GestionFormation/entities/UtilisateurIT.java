/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import java.util.Collection;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ayoub
 */
public class UtilisateurIT
{
    
    public UtilisateurIT()
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
     * Test of getIdUtilisateur method, of class Utilisateur.
     */
    @Test
    public void testGetIdUtilisateur()
    {
        System.out.println("getIdUtilisateur");
        Utilisateur instance = new Utilisateur();
        Long expResult = null;
        Long result = instance.getIdUtilisateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdUtilisateur method, of class Utilisateur.
     */
    @Test
    public void testSetIdUtilisateur()
    {
        System.out.println("setIdUtilisateur");
        Long idUtilisateur = null;
        Utilisateur instance = new Utilisateur();
        instance.setIdUtilisateur(idUtilisateur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomUtilisateur method, of class Utilisateur.
     */
    @Test
    public void testGetNomUtilisateur()
    {
        System.out.println("getNomUtilisateur");
        Utilisateur instance = new Utilisateur();
        String expResult = "";
        String result = instance.getNomUtilisateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomUtilisateur method, of class Utilisateur.
     */
    @Test
    public void testSetNomUtilisateur()
    {
        System.out.println("setNomUtilisateur");
        String nomUtilisateur = "";
        Utilisateur instance = new Utilisateur();
        instance.setNomUtilisateur(nomUtilisateur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrenomUtilisateur method, of class Utilisateur.
     */
    @Test
    public void testGetPrenomUtilisateur()
    {
        System.out.println("getPrenomUtilisateur");
        Utilisateur instance = new Utilisateur();
        String expResult = "";
        String result = instance.getPrenomUtilisateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrenomUtilisateur method, of class Utilisateur.
     */
    @Test
    public void testSetPrenomUtilisateur()
    {
        System.out.println("setPrenomUtilisateur");
        String prenomUtilisateur = "";
        Utilisateur instance = new Utilisateur();
        instance.setPrenomUtilisateur(prenomUtilisateur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJoinDate method, of class Utilisateur.
     */
    @Test
    public void testGetJoinDate()
    {
        System.out.println("getJoinDate");
        Utilisateur instance = new Utilisateur();
        Date expResult = null;
        Date result = instance.getJoinDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJoinDate method, of class Utilisateur.
     */
    @Test
    public void testSetJoinDate()
    {
        System.out.println("setJoinDate");
        Date joinDate = null;
        Utilisateur instance = new Utilisateur();
        instance.setJoinDate(joinDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUrlPhotoUtilisateur method, of class Utilisateur.
     */
    @Test
    public void testGetUrlPhotoUtilisateur()
    {
        System.out.println("getUrlPhotoUtilisateur");
        Utilisateur instance = new Utilisateur();
        String expResult = "";
        String result = instance.getUrlPhotoUtilisateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUrlPhotoUtilisateur method, of class Utilisateur.
     */
    @Test
    public void testSetUrlPhotoUtilisateur()
    {
        System.out.println("setUrlPhotoUtilisateur");
        String urlPhotoUtilisateur = "";
        Utilisateur instance = new Utilisateur();
        instance.setUrlPhotoUtilisateur(urlPhotoUtilisateur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasswordUtilisateur method, of class Utilisateur.
     */
    @Test
    public void testGetPasswordUtilisateur()
    {
        System.out.println("getPasswordUtilisateur");
        Utilisateur instance = new Utilisateur();
        String expResult = "";
        String result = instance.getPasswordUtilisateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPasswordUtilisateur method, of class Utilisateur.
     */
    @Test
    public void testSetPasswordUtilisateur()
    {
        System.out.println("setPasswordUtilisateur");
        String passwordUtilisateur = "";
        Utilisateur instance = new Utilisateur();
        instance.setPasswordUtilisateur(passwordUtilisateur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailUtilisateur method, of class Utilisateur.
     */
    @Test
    public void testGetEmailUtilisateur()
    {
        System.out.println("getEmailUtilisateur");
        Utilisateur instance = new Utilisateur();
        String expResult = "";
        String result = instance.getEmailUtilisateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmailUtilisateur method, of class Utilisateur.
     */
    @Test
    public void testSetEmailUtilisateur()
    {
        System.out.println("setEmailUtilisateur");
        String emailUtilisateur = "";
        Utilisateur instance = new Utilisateur();
        instance.setEmailUtilisateur(emailUtilisateur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoles method, of class Utilisateur.
     */
    @Test
    public void testGetRoles()
    {
        System.out.println("getRoles");
        Utilisateur instance = new Utilisateur();
        Collection<RoleUtilisateur> expResult = null;
        Collection<RoleUtilisateur> result = instance.getRoles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoles method, of class Utilisateur.
     */
    @Test
    public void testSetRoles()
    {
        System.out.println("setRoles");
        Collection<RoleUtilisateur> roles = null;
        Utilisateur instance = new Utilisateur();
        instance.setRoles(roles);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Utilisateur.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        Utilisateur instance = new Utilisateur();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
