/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import controller.request.VerificarCredencialRequest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class CredencialServiceImplIT {

    public CredencialServiceImplIT() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of verificar method, of class CredencialServiceImpl.
     */
    @Test
    public void testVerificar() throws Exception {
        try {
            System.out.println("verificar");
            VerificarCredencialRequest cred = new VerificarCredencialRequest();
            cred.setLogin("G0042204");
            cred.setSenha("D20m08.11820023");
            CredencialServiceImpl instance = new CredencialServiceImpl();
            Boolean expResult = true;
            Boolean result = instance.verificar(cred);
            assertEquals(expResult, result);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        // TODO review the generated test code and remove the default call to fail.
    }

}
