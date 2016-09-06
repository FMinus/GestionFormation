/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

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
public class EvaluationFormationMetierIT
{
    
    public EvaluationFormationMetierIT()
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
     * Test of listEvaluationFormations method, of class EvaluationFormationMetier.
     */
    @Test
    public void testListEvaluationFormations()
    {
        System.out.println("listEvaluationFormations");
        EvaluationFormationMetier instance = new EvaluationFormationMetierImpl();
        List<EvaluationFormation> expResult = null;
        List<EvaluationFormation> result = instance.listEvaluationFormations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveEvaluationFormation method, of class EvaluationFormationMetier.
     */
    @Test
    public void testSaveEvaluationFormation()
    {
        System.out.println("saveEvaluationFormation");
        EvaluationFormation evaluationFormation = null;
        EvaluationFormationMetier instance = new EvaluationFormationMetierImpl();
        EvaluationFormation expResult = null;
        EvaluationFormation result = instance.saveEvaluationFormation(evaluationFormation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EvaluationFormationMetierImpl implements EvaluationFormationMetier
    {

        public List<EvaluationFormation> listEvaluationFormations()
        {
            return null;
        }

        public EvaluationFormation saveEvaluationFormation(EvaluationFormation evaluationFormation)
        {
            return null;
        }
    }
    
}
