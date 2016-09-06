/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.RestServices;

import java.util.List;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Formation;
import org.GestionFormation.entities.SessionFormation;
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
public class FormationRestServiceIT
{
    
    public FormationRestServiceIT()
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
     * Test of getFormations method, of class FormationRestService.
     */
    @Test
    public void testGetFormations()
    {
        System.out.println("getFormations");
        Long id = null;
        FormationRestService instance = new FormationRestService();
        Formation expResult = null;
        Formation result = instance.getFormations(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCollaborateurs method, of class FormationRestService.
     */
    @Test
    public void testGetCollaborateurs()
    {
        System.out.println("getCollaborateurs");
        Long idFormation = null;
        FormationRestService instance = new FormationRestService();
        List<Collaborateur> expResult = null;
        List<Collaborateur> result = instance.getCollaborateurs(idFormation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSessionFormations method, of class FormationRestService.
     */
    @Test
    public void testGetSessionFormations()
    {
        System.out.println("getSessionFormations");
        Long idFormation = null;
        FormationRestService instance = new FormationRestService();
        List<SessionFormation> expResult = null;
        List<SessionFormation> result = instance.getSessionFormations(idFormation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveFormation method, of class FormationRestService.
     */
    @Test
    public void testSaveFormation()
    {
        System.out.println("saveFormation");
        Formation f = null;
        FormationRestService instance = new FormationRestService();
        Formation expResult = null;
        Formation result = instance.saveFormation(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listFormation method, of class FormationRestService.
     */
    @Test
    public void testListFormation()
    {
        System.out.println("listFormation");
        FormationRestService instance = new FormationRestService();
        List<Formation> expResult = null;
        List<Formation> result = instance.listFormation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCollaborateurs method, of class FormationRestService.
     */
    @Test
    public void testListCollaborateurs()
    {
        System.out.println("listCollaborateurs");
        Long idForm = null;
        FormationRestService instance = new FormationRestService();
        List<Collaborateur> expResult = null;
        List<Collaborateur> result = instance.listCollaborateurs(idForm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajoutSession method, of class FormationRestService.
     */
    @Test
    public void testAjoutSession()
    {
        System.out.println("ajoutSession");
        Long idForm = null;
        Long idSession = null;
        FormationRestService instance = new FormationRestService();
        Formation expResult = null;
        Formation result = instance.ajoutSession(idForm, idSession);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creerFormations method, of class FormationRestService.
     */
    @Test
    public void testCreerFormations()
    {
        System.out.println("creerFormations");
        Formation f = null;
        FormationRestService instance = new FormationRestService();
        instance.creerFormations(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pageFormations method, of class FormationRestService.
     */
    @Test
    public void testPageFormations()
    {
        System.out.println("pageFormations");
        String mc = "";
        int page = 0;
        int size = 0;
        FormationRestService instance = new FormationRestService();
        Page<Formation> expResult = null;
        Page<Formation> result = instance.pageFormations(mc, page, size);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
