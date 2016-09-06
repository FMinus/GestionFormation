/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Formation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author Ayoub
 */
public class CollaborateurMetierImplIT
{
    
    public CollaborateurMetierImplIT()
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
     * Test of saveCollaborateur method, of class CollaborateurMetierImpl.
     */
    @Test
    public void testSaveCollaborateur()
    {
        System.out.println("saveCollaborateur");
        Collaborateur collaborateur = null;
        CollaborateurMetierImpl instance = new CollaborateurMetierImpl();
        Collaborateur expResult = null;
        Collaborateur result = instance.saveCollaborateur(collaborateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCollaborateur method, of class CollaborateurMetierImpl.
     */
    @Test
    public void testListCollaborateur()
    {
        System.out.println("listCollaborateur");
        CollaborateurMetierImpl instance = new CollaborateurMetierImpl();
        List<Collaborateur> expResult = null;
        List<Collaborateur> result = instance.listCollaborateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCollaborateur method, of class CollaborateurMetierImpl.
     */
    @Test
    public void testGetCollaborateur()
    {
        System.out.println("getCollaborateur");
        Long idCollaborateur = null;
        CollaborateurMetierImpl instance = new CollaborateurMetierImpl();
        Collaborateur expResult = null;
        Collaborateur result = instance.getCollaborateur(idCollaborateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajoutFormation method, of class CollaborateurMetierImpl.
     */
    @Test
    public void testAjoutFormation()
    {
        System.out.println("ajoutFormation");
        Long idFormation = null;
        Long idCollaborateur = null;
        CollaborateurMetierImpl instance = new CollaborateurMetierImpl();
        Collaborateur expResult = null;
        Collaborateur result = instance.ajoutFormation(idFormation, idCollaborateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFormationsOfCollab method, of class CollaborateurMetierImpl.
     */
    @Test
    public void testGetFormationsOfCollab()
    {
        System.out.println("getFormationsOfCollab");
        Long idCollab = null;
        CollaborateurMetierImpl instance = new CollaborateurMetierImpl();
        List<Formation> expResult = null;
        List<Formation> result = instance.getFormationsOfCollab(idCollab);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajoutCollaborateur method, of class CollaborateurMetierImpl.
     */
    @Test
    public void testAjoutCollaborateur()
    {
        System.out.println("ajoutCollaborateur");
        Long idUser = null;
        Long idFormation = null;
        CollaborateurMetierImpl instance = new CollaborateurMetierImpl();
        Collaborateur expResult = null;
        Collaborateur result = instance.ajoutCollaborateur(idUser, idFormation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCollaborateur method, of class CollaborateurMetierImpl.
     */
    @Test
    public void testFindCollaborateur()
    {
        System.out.println("findCollaborateur");
        String mc = "";
        Pageable pageable = null;
        CollaborateurMetierImpl instance = new CollaborateurMetierImpl();
        Page<Collaborateur> expResult = null;
        Page<Collaborateur> result = instance.findCollaborateur(mc, pageable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAllCollaborateur method, of class CollaborateurMetierImpl.
     */
    @Test
    public void testFindAllCollaborateur()
    {
        System.out.println("findAllCollaborateur");
        Pageable pgbl = null;
        CollaborateurMetierImpl instance = new CollaborateurMetierImpl();
        Page<Collaborateur> expResult = null;
        Page<Collaborateur> result = instance.findAllCollaborateur(pgbl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCollaborateurOnly method, of class CollaborateurMetierImpl.
     */
    @Test
    public void testFindCollaborateurOnly()
    {
        System.out.println("findCollaborateurOnly");
        String mc = "";
        Pageable pageable = null;
        CollaborateurMetierImpl instance = new CollaborateurMetierImpl();
        Page<Collaborateur> expResult = null;
        Page<Collaborateur> result = instance.findCollaborateurOnly(mc, pageable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneCollaborateurByEmail method, of class CollaborateurMetierImpl.
     */
    @Test
    public void testFindOneCollaborateurByEmail()
    {
        System.out.println("findOneCollaborateurByEmail");
        String email = "";
        CollaborateurMetierImpl instance = new CollaborateurMetierImpl();
        Collaborateur expResult = null;
        Collaborateur result = instance.findOneCollaborateurByEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
