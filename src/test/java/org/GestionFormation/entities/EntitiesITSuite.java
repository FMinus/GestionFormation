/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Ayoub
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
{
    org.GestionFormation.entities.EvaluationFormationIT.class, org.GestionFormation.entities.ResponsableFormationIT.class, org.GestionFormation.entities.DocumentIT.class, org.GestionFormation.entities.CollaborateurIT.class, org.GestionFormation.entities.RoleUtilisateurIT.class, org.GestionFormation.entities.FormationIT.class, org.GestionFormation.entities.SessionFormationIT.class, org.GestionFormation.entities.FormateurIT.class, org.GestionFormation.entities.UtilisateurIT.class, org.GestionFormation.entities.AbsenceIT.class, org.GestionFormation.entities.AdministrateurIT.class
})
public class EntitiesITSuite
{

    @BeforeClass
    public static void setUpClass() throws Exception
    {
    }

    @AfterClass
    public static void tearDownClass() throws Exception
    {
    }

    @Before
    public void setUp() throws Exception
    {
    }

    @After
    public void tearDown() throws Exception
    {
    }
    
}
