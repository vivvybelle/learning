package org.vivan.experiments;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.vivan.experiments.Subtracter;

public class Subtractertest {

    @Test(dataProvider="subtractTestDP")
    public void subtractTest(int init, int minuend, int expected) {
        Subtracter s = new Subtracter(init);
        assertEquals(s.subtract(minuend), expected);
    }
    
    @DataProvider
    public Object[][] subtractTestDP() {
        return new Object[][] {
            {0, 0, 0},
            {1, 0, 1},
            {5, 0, 5},
            
            {8, 1, 7},
            {5, 3, 2},
            {9, 8, 1},

            {1, 9, -8},
            {1, 5, -4},
            {2, 3, -1},
        };
    }
}
