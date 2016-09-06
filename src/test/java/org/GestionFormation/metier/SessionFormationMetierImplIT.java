/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.SessionFormation;
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
public class SessionFormationMetierImplIT
{
    
    public SessionFormationMetierImplIT()
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
     * Test of saveSessionFormation method, of class SessionFormationMetierImpl.
     */
    @Test
    public void testSaveSessionFormation()
    {
        System.out.println("saveSessionFormation");
        SessionFormation sf = null;
        SessionFormationMetierImpl instance = new SessionFormationMetierImpl();
        SessionFormation expResult = null;
        SessionFormation result = instance.saveSessionFormation(sf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listSessionFormations method, of class SessionFormationMetierImpl.
     */
    @Test
    public void testListSessionFormations()
    {
        System.out.println("listSessionFormations");
        SessionFormationMetierImpl instance = new SessionFormationMetierImpl();
        List<SessionFormation> expResult = null;
        List<SessionFormation> result = instance.listSessionFormations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSessionFormations method, of class SessionFormationMetierImpl.
     */
    @Test
    public void testGetSessionFormations()
    {
        System.out.println("getSessionFormations");
        Long idFormation = null;
        SessionFormationMetierImpl instance = new SessionFormationMetierImpl();
        SessionFormation expResult = null;
        SessionFormation result = instance.getSessionFormations(idFormation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
