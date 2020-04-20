package org.vivan.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplierTest {

    @Test(dataProvider="multiplyTestDP")
    public void multiplyTest(int init, int multiple, int expected) {
        Multiplier m = new Multiplier(init);
        assertEquals(m.multiply(multiple), expected);
    }
    
    @DataProvider
    public Object[][] multiplyTestDP() {
        return new Object[][] {
            {0, 0, 0},
            {0, 5, 0},
            {5, 0, 0},

            {1, 5, 5},
            {3, 5, 15},
            {8, 8, 64},

            {-1, 5, -5},
            {-1, -5, 5},
            {-2, -3, 6},
        };
    }
}
