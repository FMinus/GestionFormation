/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

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
public class RoleUtilisateurIT
{
    
    public RoleUtilisateurIT()
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
     * Test of getNomRole method, of class RoleUtilisateur.
     */
    @Test
    public void testGetNomRole()
    {
        System.out.println("getNomRole");
        RoleUtilisateur instance = new RoleUtilisateur();
        String expResult = "";
        String result = instance.getNomRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomRole method, of class RoleUtilisateur.
     */
    @Test
    public void testSetNomRole()
    {
        System.out.println("setNomRole");
        String nomRole = "";
        RoleUtilisateur instance = new RoleUtilisateur();
        instance.setNomRole(nomRole);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class RoleUtilisateur.
     */
    @Test
    public void testGetDescription()
    {
        System.out.println("getDescription");
        RoleUtilisateur instance = new RoleUtilisateur();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class RoleUtilisateur.
     */
    @Test
    public void testSetDescription()
    {
        System.out.println("setDescription");
        String description = "";
        RoleUtilisateur instance = new RoleUtilisateur();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class RoleUtilisateur.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        RoleUtilisateur instance = new RoleUtilisateur();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
