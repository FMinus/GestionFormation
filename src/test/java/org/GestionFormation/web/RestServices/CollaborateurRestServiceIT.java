/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.RestServices;

import java.util.List;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Formation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.data.domain.Page;

/**
 *
 * @author Ayoub
 */
public class CollaborateurRestServiceIT
{
    
    public CollaborateurRestServiceIT()
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
     * Test of saveCollaborateur method, of class CollaborateurRestService.
     */
    @Test
    public void testSaveCollaborateur()
    {
        System.out.println("saveCollaborateur");
        Collaborateur collaborateur = null;
        CollaborateurRestService instance = new CollaborateurRestService();
        Collaborateur expResult = null;
        Collaborateur result = instance.saveCollaborateur(collaborateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCollaborateur method, of class CollaborateurRestService.
     */
    @Test
    public void testListCollaborateur_0args()
    {
        System.out.println("listCollaborateur");
        CollaborateurRestService instance = new CollaborateurRestService();
        List<Collaborateur> expResult = null;
        List<Collaborateur> result = instance.listCollaborateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajoutFormationCollaborateur method, of class CollaborateurRestService.
     */
    @Test
    public void testAjoutFormationCollaborateur()
    {
        System.out.println("ajoutFormationCollaborateur");
        Long idcol = null;
        Long idfor = null;
        CollaborateurRestService instance = new CollaborateurRestService();
        Collaborateur expResult = null;
        Collaborateur result = instance.ajoutFormationCollaborateur(idcol, idfor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listFormationsCollaborateur method, of class CollaborateurRestService.
     */
    @Test
    public void testListFormationsCollaborateur()
    {
        System.out.println("listFormationsCollaborateur");
        Long idcol = null;
        CollaborateurRestService instance = new CollaborateurRestService();
        List<Formation> expResult = null;
        List<Formation> result = instance.listFormationsCollaborateur(idcol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCollaborateur method, of class CollaborateurRestService.
     */
    @Test
    public void testListCollaborateur_int_int()
    {
        System.out.println("listCollaborateur");
        int page = 0;
        int size = 0;
        CollaborateurRestService instance = new CollaborateurRestService();
        Page<Collaborateur> expResult = null;
        Page<Collaborateur> result = instance.listCollaborateur(page, size);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pageUtilisateursOnly method, of class CollaborateurRestService.
     */
    @Test
    public void testPageUtilisateursOnly()
    {
        System.out.println("pageUtilisateursOnly");
        String mc = "";
        int page = 0;
        int size = 0;
        CollaborateurRestService instance = new CollaborateurRestService();
        Page<Collaborateur> expResult = null;
        Page<Collaborateur> result = instance.pageUtilisateursOnly(mc, page, size);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
