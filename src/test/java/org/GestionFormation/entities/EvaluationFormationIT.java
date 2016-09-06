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
public class EvaluationFormationIT
{
    
    public EvaluationFormationIT()
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
     * Test of getIdEvaliationFormation method, of class EvaluationFormation.
     */
    @Test
    public void testGetIdEvaliationFormation()
    {
        System.out.println("getIdEvaliationFormation");
        EvaluationFormation instance = new EvaluationFormation();
        Long expResult = null;
        Long result = instance.getIdEvaliationFormation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdEvaliationFormation method, of class EvaluationFormation.
     */
    @Test
    public void testSetIdEvaliationFormation()
    {
        System.out.println("setIdEvaliationFormation");
        Long idEvaliationFormation = null;
        EvaluationFormation instance = new EvaluationFormation();
        instance.setIdEvaliationFormation(idEvaliationFormation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCollaborateur method, of class EvaluationFormation.
     */
    @Test
    public void testGetCollaborateur()
    {
        System.out.println("getCollaborateur");
        EvaluationFormation instance = new EvaluationFormation();
        Collaborateur expResult = null;
        Collaborateur result = instance.getCollaborateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCollaborateur method, of class EvaluationFormation.
     */
    @Test
    public void testSetCollaborateur()
    {
        System.out.println("setCollaborateur");
        Collaborateur collaborateur = null;
        EvaluationFormation instance = new EvaluationFormation();
        instance.setCollaborateur(collaborateur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFormation method, of class EvaluationFormation.
     */
    @Test
    public void testGetFormation()
    {
        System.out.println("getFormation");
        EvaluationFormation instance = new EvaluationFormation();
        Formation expResult = null;
        Formation result = instance.getFormation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFormation method, of class EvaluationFormation.
     */
    @Test
    public void testSetFormation()
    {
        System.out.println("setFormation");
        Formation formation = null;
        EvaluationFormation instance = new EvaluationFormation();
        instance.setFormation(formation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRevueFormation method, of class EvaluationFormation.
     */
    @Test
    public void testGetRevueFormation()
    {
        System.out.println("getRevueFormation");
        EvaluationFormation instance = new EvaluationFormation();
        String expResult = "";
        String result = instance.getRevueFormation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRevueFormation method, of class EvaluationFormation.
     */
    @Test
    public void testSetRevueFormation()
    {
        System.out.println("setRevueFormation");
        String revueFormation = "";
        EvaluationFormation instance = new EvaluationFormation();
        instance.setRevueFormation(revueFormation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarqueFormation method, of class EvaluationFormation.
     */
    @Test
    public void testGetMarqueFormation()
    {
        System.out.println("getMarqueFormation");
        EvaluationFormation instance = new EvaluationFormation();
        int expResult = 0;
        int result = instance.getMarqueFormation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarqueFormation method, of class EvaluationFormation.
     */
    @Test
    public void testSetMarqueFormation()
    {
        System.out.println("setMarqueFormation");
        int marqueFormation = 0;
        EvaluationFormation instance = new EvaluationFormation();
        instance.setMarqueFormation(marqueFormation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class EvaluationFormation.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        EvaluationFormation instance = new EvaluationFormation();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
