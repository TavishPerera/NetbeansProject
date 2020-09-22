/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calibre;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Tavish
 */
public class LoginToContinueTest {

    public LoginToContinueTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of loginFunction method, of class LoginToContinue.
     */
    @Test
    public void testLoginFunction() {
        System.out.println("loginFunction");
        LoginToContinue instance = new LoginToContinue();
        String expected = "Hi";
        String actual = null;
        assertEquals(expected, actual);
        instance.loginFunction();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeWindow method, of class LoginToContinue.
     */
    @Test
    public void testChangeWindow() {
        System.out.println("changeWindow");
        LoginToContinue instance = new LoginToContinue();
        instance.changeWindow();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
