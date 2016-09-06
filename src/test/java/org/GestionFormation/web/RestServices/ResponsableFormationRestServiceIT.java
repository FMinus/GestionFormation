/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.RestServices;

import java.util.List;
import org.GestionFormation.entities.ResponsableFormation;
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
public class ResponsableFormationRestServiceIT
{
    
    public ResponsableFormationRestServiceIT()
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
     * Test of saveResponsableFormation method, of class ResponsableFormationRestService.
     */
    @Test
    public void testSaveResponsableFormation()
    {
        System.out.println("saveResponsableFormation");
        ResponsableFormation r = null;
        ResponsableFormationRestService instance = new ResponsableFormationRestService();
        ResponsableFormation expResult = null;
        ResponsableFormation result = instance.saveResponsableFormation(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listResponsableFormation method, of class ResponsableFormationRestService.
     */
    @Test
    public void testListResponsableFormation()
    {
        System.out.println("listResponsableFormation");
        ResponsableFormationRestService instance = new ResponsableFormationRestService();
        List<ResponsableFormation> expResult = null;
        List<ResponsableFormation> result = instance.listResponsableFormation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
