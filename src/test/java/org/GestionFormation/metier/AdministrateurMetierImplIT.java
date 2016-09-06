/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

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
public class AdministrateurMetierImplIT
{
    
    public AdministrateurMetierImplIT()
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
     * Test of saveAdministrateur method, of class AdministrateurMetierImpl.
     */
    @Test
    public void testSaveAdministrateur()
    {
        System.out.println("saveAdministrateur");
        Administrateur a = null;
        AdministrateurMetierImpl instance = new AdministrateurMetierImpl();
        Administrateur expResult = null;
        Administrateur result = instance.saveAdministrateur(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listAdministrateurs method, of class AdministrateurMetierImpl.
     */
    @Test
    public void testListAdministrateurs()
    {
        System.out.println("listAdministrateurs");
        AdministrateurMetierImpl instance = new AdministrateurMetierImpl();
        List<Administrateur> expResult = null;
        List<Administrateur> result = instance.listAdministrateurs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
