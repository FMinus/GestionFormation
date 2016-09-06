/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation;

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
    org.GestionFormation.dao.DaoITSuite.class, org.GestionFormation.GestionFormationApplicationIT.class, org.GestionFormation.entities.EntitiesITSuite.class, org.GestionFormation.controller.ControllerITSuite.class, org.GestionFormation.metier.MetierITSuite.class, org.GestionFormation.web.WebITSuite.class
})
public class GestionFormationITSuite
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
