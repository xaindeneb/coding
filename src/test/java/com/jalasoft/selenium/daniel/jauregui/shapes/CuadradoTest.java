package com.jalasoft.selenium.daniel.jauregui.shapes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * CuadradoTest.
 * @author daniel jauregui
 */
public class CuadradoTest {

    private ShapeInt instance;
    private static final double DELTA = 0.0;

    /**
     * Initialize Variables.
     */
    @Before
    public void setUp() {
        //Given
        final double altura = 5.2;
        instance = new Square(altura);
    }

    /**
     * Test of calculateArea method, of class Square.
     */
    @Test
    public void testCalculateArea() {
         // When
        final double result = instance.calculateArea();

        //Then
        System.out.println("calculateArea");
        final double expResult = 27.04;
        assertEquals(expResult, result, DELTA);
    }

    /**
     * Test of calculatePerimeter method, of class Square.
     */
    @Test
    public void testCalculatePerimeter() {
        // When
        final double result = instance.calculatePerimeter();

        //Then
        System.out.println("calculatePerimeter");
        final double expResult = 20.8;
        assertEquals(expResult, result, DELTA);
    }
}
