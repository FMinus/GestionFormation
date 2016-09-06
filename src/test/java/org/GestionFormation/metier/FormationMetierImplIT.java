/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Formation;
import org.GestionFormation.entities.SessionFormation;
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
public class FormationMetierImplIT
{
    
    public FormationMetierImplIT()
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
     * Test of saveFormation method, of class FormationMetierImpl.
     */
    @Test
    public void testSaveFormation()
    {
        System.out.println("saveFormation");
        Formation f = null;
        FormationMetierImpl instance = new FormationMetierImpl();
        Formation expResult = null;
        Formation result = instance.saveFormation(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listFormations method, of class FormationMetierImpl.
     */
    @Test
    public void testListFormations()
    {
        System.out.println("listFormations");
        FormationMetierImpl instance = new FormationMetierImpl();
        List<Formation> expResult = null;
        List<Formation> result = instance.listFormations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFormations method, of class FormationMetierImpl.
     */
    @Test
    public void testGetFormations()
    {
        System.out.println("getFormations");
        Long id = null;
        FormationMetierImpl instance = new FormationMetierImpl();
        Formation expResult = null;
        Formation result = instance.getFormations(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCollaborateurs method, of class FormationMetierImpl.
     */
    @Test
    public void testGetCollaborateurs()
    {
        System.out.println("getCollaborateurs");
        Long idFormation = null;
        FormationMetierImpl instance = new FormationMetierImpl();
        List<Collaborateur> expResult = null;
        List<Collaborateur> result = instance.getCollaborateurs(idFormation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSessionFormations method, of class FormationMetierImpl.
     */
    @Test
    public void testGetSessionFormations()
    {
        System.out.println("getSessionFormations");
        Long idFormation = null;
        FormationMetierImpl instance = new FormationMetierImpl();
        List<SessionFormation> expResult = null;
        List<SessionFormation> result = instance.getSessionFormations(idFormation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajoutSession method, of class FormationMetierImpl.
     */
    @Test
    public void testAjoutSession()
    {
        System.out.println("ajoutSession");
        Long idFormation = null;
        Long idsessionFormation = null;
        FormationMetierImpl instance = new FormationMetierImpl();
        Formation expResult = null;
        Formation result = instance.ajoutSession(idFormation, idsessionFormation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findFormations method, of class FormationMetierImpl.
     */
    @Test
    public void testFindFormations()
    {
        System.out.println("findFormations");
        String mc = "";
        Pageable pageable = null;
        FormationMetierImpl instance = new FormationMetierImpl();
        Page<Formation> expResult = null;
        Page<Formation> result = instance.findFormations(mc, pageable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findFormationByName method, of class FormationMetierImpl.
     */
    @Test
    public void testFindFormationByName()
    {
        System.out.println("findFormationByName");
        String mc = "";
        FormationMetierImpl instance = new FormationMetierImpl();
        Formation expResult = null;
        Formation result = instance.findFormationByName(mc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFormation method, of class FormationMetierImpl.
     */
    @Test
    public void testDeleteFormation()
    {
        System.out.println("deleteFormation");
        Formation f = null;
        FormationMetierImpl instance = new FormationMetierImpl();
        instance.deleteFormation(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneFormationByNom method, of class FormationMetierImpl.
     */
    @Test
    public void testFindOneFormationByNom()
    {
        System.out.println("findOneFormationByNom");
        String nomFormation = "";
        FormationMetierImpl instance = new FormationMetierImpl();
        Formation expResult = null;
        Formation result = instance.findOneFormationByNom(nomFormation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
