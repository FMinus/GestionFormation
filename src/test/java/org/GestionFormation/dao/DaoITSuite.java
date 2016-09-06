/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

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
    org.GestionFormation.dao.SessionFormationRepositoryIT.class, org.GestionFormation.dao.EvaluationFormationRepositoryIT.class, org.GestionFormation.dao.CollaborateurRepositoryIT.class, org.GestionFormation.dao.AbsenceRepositoryIT.class, org.GestionFormation.dao.UtilisateurRepositoryIT.class, org.GestionFormation.dao.AdministrateurRepositoryIT.class, org.GestionFormation.dao.DocumentRepositoryIT.class, org.GestionFormation.dao.FormationRepositoryIT.class, org.GestionFormation.dao.RoleUtilisateurRepositoryIT.class, org.GestionFormation.dao.FormateurRepositoryIT.class, org.GestionFormation.dao.ResponsableFormationRepositoryIT.class
})
public class DaoITSuite
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
