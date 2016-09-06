/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.RestServices;

import java.util.List;
import org.GestionFormation.entities.EvaluationFormation;
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
public class EvaluationFormationRestServiceIT
{
    
    public EvaluationFormationRestServiceIT()
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
     * Test of listEvaluationFormations method, of class EvaluationFormationRestService.
     */
    @Test
    public void testListEvaluationFormations()
    {
        System.out.println("listEvaluationFormations");
        EvaluationFormationRestService instance = new EvaluationFormationRestService();
        List<EvaluationFormation> expResult = null;
        List<EvaluationFormation> result = instance.listEvaluationFormations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveEvaluationFormation method, of class EvaluationFormationRestService.
     */
    @Test
    public void testSaveEvaluationFormation()
    {
        System.out.println("saveEvaluationFormation");
        EvaluationFormation evaluationFormation = null;
        EvaluationFormationRestService instance = new EvaluationFormationRestService();
        EvaluationFormation expResult = null;
        EvaluationFormation result = instance.saveEvaluationFormation(evaluationFormation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
