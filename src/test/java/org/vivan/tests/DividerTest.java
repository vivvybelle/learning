package org.vivan.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DividerTest {

    @Test(dataProvider="divideTestDP")
    public void divideTest(int init, int divitend, int expected) {
        Divider d = new Divider(init);
        assertEquals(d.divide(divitend), expected);
    }
    
    @DataProvider
    public Object[][] divideTestDP() {
        return new Object[][] {
            {0, 8, 0},
            {0, 1, 0},
            {0, 5, 0},
            
            {8, 1, 8},
            {4, 2, 2},
            {8, 2, 4},

            {-2, 1, -2},
            {-5, 5, -1},
            {-6, 3, -2},
        };
    }
    
    @Test
    (expectedExceptions=ArithmeticException.class
            , expectedExceptionsMessageRegExp="/ by zero")
    public void divideByZeroTest() {
        new Divider(5).divide(0);
    }
}
