/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.RoleUtilisateur;
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
public class RoleUtilisateurMetierImplIT
{
    
    public RoleUtilisateurMetierImplIT()
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
     * Test of listRoleUtilisateur method, of class RoleUtilisateurMetierImpl.
     */
    @Test
    public void testListRoleUtilisateur()
    {
        System.out.println("listRoleUtilisateur");
        RoleUtilisateurMetierImpl instance = new RoleUtilisateurMetierImpl();
        List<RoleUtilisateur> expResult = null;
        List<RoleUtilisateur> result = instance.listRoleUtilisateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRolesUtilisateur method, of class RoleUtilisateurMetierImpl.
     */
    @Test
    public void testFindRolesUtilisateur()
    {
        System.out.println("findRolesUtilisateur");
        String nomRole = "";
        RoleUtilisateurMetierImpl instance = new RoleUtilisateurMetierImpl();
        List<RoleUtilisateur> expResult = null;
        List<RoleUtilisateur> result = instance.findRolesUtilisateur(nomRole);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveRoleUtilisateur method, of class RoleUtilisateurMetierImpl.
     */
    @Test
    public void testSaveRoleUtilisateur()
    {
        System.out.println("saveRoleUtilisateur");
        RoleUtilisateur r = null;
        RoleUtilisateurMetierImpl instance = new RoleUtilisateurMetierImpl();
        RoleUtilisateur expResult = null;
        RoleUtilisateur result = instance.saveRoleUtilisateur(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveNewRoleUtilisateur method, of class RoleUtilisateurMetierImpl.
     */
    @Test
    public void testSaveNewRoleUtilisateur()
    {
        System.out.println("saveNewRoleUtilisateur");
        String nom = "";
        String Desc = "";
        RoleUtilisateurMetierImpl instance = new RoleUtilisateurMetierImpl();
        RoleUtilisateur expResult = null;
        RoleUtilisateur result = instance.saveNewRoleUtilisateur(nom, Desc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoleUtilisateur method, of class RoleUtilisateurMetierImpl.
     */
    @Test
    public void testGetRoleUtilisateur()
    {
        System.out.println("getRoleUtilisateur");
        String nom = "";
        RoleUtilisateurMetierImpl instance = new RoleUtilisateurMetierImpl();
        RoleUtilisateur expResult = null;
        RoleUtilisateur result = instance.getRoleUtilisateur(nom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
