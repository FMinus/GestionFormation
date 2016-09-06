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
public class FormationIT
{
    
    public FormationIT()
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
     * Test of getSessionFormations method, of class Formation.
     */
    @Test
    public void testGetSessionFormations()
    {
        System.out.println("getSessionFormations");
        Formation instance = new Formation();
        Collection<SessionFormation> expResult = null;
        Collection<SessionFormation> result = instance.getSessionFormations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSessionFormations method, of class Formation.
     */
    @Test
    public void testSetSessionFormations()
    {
        System.out.println("setSessionFormations");
        Collection<SessionFormation> sessionFormations = null;
        Formation instance = new Formation();
        instance.setSessionFormations(sessionFormations);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdFormation method, of class Formation.
     */
    @Test
    public void testGetIdFormation()
    {
        System.out.println("getIdFormation");
        Formation instance = new Formation();
        Long expResult = null;
        Long result = instance.getIdFormation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdFormation method, of class Formation.
     */
    @Test
    public void testSetIdFormation()
    {
        System.out.println("setIdFormation");
        Long idFormation = null;
        Formation instance = new Formation();
        instance.setIdFormation(idFormation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomFormation method, of class Formation.
     */
    @Test
    public void testGetNomFormation()
    {
        System.out.println("getNomFormation");
        Formation instance = new Formation();
        String expResult = "";
        String result = instance.getNomFormation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomFormation method, of class Formation.
     */
    @Test
    public void testSetNomFormation()
    {
        System.out.println("setNomFormation");
        String nomFormation = "";
        Formation instance = new Formation();
        instance.setNomFormation(nomFormation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Formation.
     */
    @Test
    public void testGetDescription()
    {
        System.out.println("getDescription");
        Formation instance = new Formation();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Formation.
     */
    @Test
    public void testSetDescription()
    {
        System.out.println("setDescription");
        String Description = "";
        Formation instance = new Formation();
        instance.setDescription(Description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateFormation method, of class Formation.
     */
    @Test
    public void testGetDateFormation()
    {
        System.out.println("getDateFormation");
        Formation instance = new Formation();
        Date expResult = null;
        Date result = instance.getDateFormation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateFormation method, of class Formation.
     */
    @Test
    public void testSetDateFormation()
    {
        System.out.println("setDateFormation");
        Date dateFormation = null;
        Formation instance = new Formation();
        instance.setDateFormation(dateFormation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResponsableFormation method, of class Formation.
     */
    @Test
    public void testGetResponsableFormation()
    {
        System.out.println("getResponsableFormation");
        Formation instance = new Formation();
        ResponsableFormation expResult = null;
        ResponsableFormation result = instance.getResponsableFormation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResponsableFormation method, of class Formation.
     */
    @Test
    public void testSetResponsableFormation()
    {
        System.out.println("setResponsableFormation");
        ResponsableFormation responsableFormation = null;
        Formation instance = new Formation();
        instance.setResponsableFormation(responsableFormation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCollaborateurs method, of class Formation.
     */
    @Test
    public void testGetCollaborateurs()
    {
        System.out.println("getCollaborateurs");
        Formation instance = new Formation();
        Collection<Collaborateur> expResult = null;
        Collection<Collaborateur> result = instance.getCollaborateurs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCollaborateurs method, of class Formation.
     */
    @Test
    public void testSetCollaborateurs()
    {
        System.out.println("setCollaborateurs");
        Collection<Collaborateur> collaborateurs = null;
        Formation instance = new Formation();
        instance.setCollaborateurs(collaborateurs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvaluationFormations method, of class Formation.
     */
    @Test
    public void testGetEvaluationFormations()
    {
        System.out.println("getEvaluationFormations");
        Formation instance = new Formation();
        Collection<EvaluationFormation> expResult = null;
        Collection<EvaluationFormation> result = instance.getEvaluationFormations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEvaluationFormations method, of class Formation.
     */
    @Test
    public void testSetEvaluationFormations()
    {
        System.out.println("setEvaluationFormations");
        Collection<EvaluationFormation> evaluationFormations = null;
        Formation instance = new Formation();
        instance.setEvaluationFormations(evaluationFormations);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Formation.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        Formation instance = new Formation();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
