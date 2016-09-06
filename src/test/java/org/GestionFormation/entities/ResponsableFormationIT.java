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
public class ResponsableFormationIT
{
    
    public ResponsableFormationIT()
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
     * Test of getFormations method, of class ResponsableFormation.
     */
    @Test
    public void testGetFormations()
    {
        System.out.println("getFormations");
        ResponsableFormation instance = new ResponsableFormation();
        Collection<Formation> expResult = null;
        Collection<Formation> result = instance.getFormations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFormations method, of class ResponsableFormation.
     */
    @Test
    public void testSetFormations()
    {
        System.out.println("setFormations");
        Collection<Formation> formations = null;
        ResponsableFormation instance = new ResponsableFormation();
        instance.setFormations(formations);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ResponsableFormation.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        ResponsableFormation instance = new ResponsableFormation();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
