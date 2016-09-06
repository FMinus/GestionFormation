/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.RestServices;

import java.util.List;
import org.GestionFormation.entities.Administrateur;
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
public class AdministrateurRestServiceIT
{
    
    public AdministrateurRestServiceIT()
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
     * Test of saveAdministrateur method, of class AdministrateurRestService.
     */
    @Test
    public void testSaveAdministrateur()
    {
        System.out.println("saveAdministrateur");
        Administrateur a = null;
        AdministrateurRestService instance = new AdministrateurRestService();
        Administrateur expResult = null;
        Administrateur result = instance.saveAdministrateur(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listAdministrateurs method, of class AdministrateurRestService.
     */
    @Test
    public void testListAdministrateurs()
    {
        System.out.println("listAdministrateurs");
        AdministrateurRestService instance = new AdministrateurRestService();
        List<Administrateur> expResult = null;
        List<Administrateur> result = instance.listAdministrateurs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
