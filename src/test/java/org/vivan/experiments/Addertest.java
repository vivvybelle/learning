package org.vivan.experiments;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.vivan.experiments.Adder;

public class Addertest {

    @Test(dataProvider="addTestDP")
    public void addTest(int init, int additive, int expected) {
        Adder a = new Adder(init);
        assertEquals(a.add(additive), expected);
    }

    @DataProvider
    public Object[][] addTestDP() {
        return new Object[][] {
            {0, 0, 0},
            {0, 5, 5},
            {5, 0, 5},

            {1, 5, 6},
            {3, 5, 8},
            {8, 8, 16},

            {-1, -1, -2},
            {10, -5, 5},
            {-2, 3, 1},

        };
    }
}
