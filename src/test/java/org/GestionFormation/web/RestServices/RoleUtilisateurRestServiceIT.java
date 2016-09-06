/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.RestServices;

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
public class RoleUtilisateurRestServiceIT
{
    
    public RoleUtilisateurRestServiceIT()
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
     * Test of listRoleUtilisateur method, of class RoleUtilisateurRestService.
     */
    @Test
    public void testListRoleUtilisateur()
    {
        System.out.println("listRoleUtilisateur");
        RoleUtilisateurRestService instance = new RoleUtilisateurRestService();
        List<RoleUtilisateur> expResult = null;
        List<RoleUtilisateur> result = instance.listRoleUtilisateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRolesUtilisateur method, of class RoleUtilisateurRestService.
     */
    @Test
    public void testFindRolesUtilisateur()
    {
        System.out.println("findRolesUtilisateur");
        String nomRole = "";
        RoleUtilisateurRestService instance = new RoleUtilisateurRestService();
        List<RoleUtilisateur> expResult = null;
        List<RoleUtilisateur> result = instance.findRolesUtilisateur(nomRole);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveRoleUtilisateur method, of class RoleUtilisateurRestService.
     */
    @Test
    public void testSaveRoleUtilisateur()
    {
        System.out.println("saveRoleUtilisateur");
        RoleUtilisateur r = null;
        RoleUtilisateurRestService instance = new RoleUtilisateurRestService();
        RoleUtilisateur expResult = null;
        RoleUtilisateur result = instance.saveRoleUtilisateur(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoleUtilisateur method, of class RoleUtilisateurRestService.
     */
    @Test
    public void testGetRoleUtilisateur()
    {
        System.out.println("getRoleUtilisateur");
        String nom = "";
        RoleUtilisateurRestService instance = new RoleUtilisateurRestService();
        RoleUtilisateur expResult = null;
        RoleUtilisateur result = instance.getRoleUtilisateur(nom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
