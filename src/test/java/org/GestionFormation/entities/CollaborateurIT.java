/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import java.util.Collection;
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
public class CollaborateurIT
{
    
    public CollaborateurIT()
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
     * Test of isConfirmationInscription method, of class Collaborateur.
     */
    @Test
    public void testIsConfirmationInscription()
    {
        System.out.println("isConfirmationInscription");
        Collaborateur instance = new Collaborateur();
        boolean expResult = false;
        boolean result = instance.isConfirmationInscription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConfirmationInscription method, of class Collaborateur.
     */
    @Test
    public void testSetConfirmationInscription()
    {
        System.out.println("setConfirmationInscription");
        boolean confirmationInscription = false;
        Collaborateur instance = new Collaborateur();
        instance.setConfirmationInscription(confirmationInscription);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvaluationFormations method, of class Collaborateur.
     */
    @Test
    public void testGetEvaluationFormations()
    {
        System.out.println("getEvaluationFormations");
        Collaborateur instance = new Collaborateur();
        Collection<EvaluationFormation> expResult = null;
        Collection<EvaluationFormation> result = instance.getEvaluationFormations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEvaluationFormations method, of class Collaborateur.
     */
    @Test
    public void testSetEvaluationFormations()
    {
        System.out.println("setEvaluationFormations");
        Collection<EvaluationFormation> evaluationFormations = null;
        Collaborateur instance = new Collaborateur();
        instance.setEvaluationFormations(evaluationFormations);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFormations method, of class Collaborateur.
     */
    @Test
    public void testGetFormations()
    {
        System.out.println("getFormations");
        Collaborateur instance = new Collaborateur();
        Collection<Formation> expResult = null;
        Collection<Formation> result = instance.getFormations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFormations method, of class Collaborateur.
     */
    @Test
    public void testSetFormations()
    {
        System.out.println("setFormations");
        Collection<Formation> formations = null;
        Collaborateur instance = new Collaborateur();
        instance.setFormations(formations);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Collaborateur.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        Collaborateur instance = new Collaborateur();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
