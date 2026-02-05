/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package unittestdemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pate1823
 */
public class UnitTestDemoTest {
    
    public UnitTestDemoTest() {
    }

    /**
     * Test of greet method, of class UnitTestDemo.
     */
    @Test
    public void testGreet() {
        UnitTestDemo utd=new UnitTestDemo();
        assertEquals("Hello World!!",utd.greet());
        
    }
    
}
