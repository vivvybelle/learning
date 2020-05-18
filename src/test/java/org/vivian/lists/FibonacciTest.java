package org.vivian.lists;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.vivan.lists.Fibonacci;

public class FibonacciTest {

    @Test(dataProvider="fibonacciTestDP")
    public void fibanacciTest(int init, int expected) {
        assertEquals(Fibonacci.calculate(init), expected);
    }

    @DataProvider
    Object [][] fibonacciTestDP() {
        return new Object [][] {
            {0,0},

            {1,1},
            {2,1},
            {3,2},

            {4,3},
            {5,5}, 
            {6,8},

            {10,55},
            {13,233},
        };
    }
}