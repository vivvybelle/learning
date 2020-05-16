package org.vivan.experiments;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.vivan.experiments.Square;

public class SquareTest {

    @Test(dataProvider="areaTestDP")
    public void areaTest(int size, int expected) {
        Square s = new Square(size);
        assertEquals(s.area(), expected);
    }

    @DataProvider
    public Object[][] areaTestDP() {
        return new Object[][] {
            {0,0},
            {1,2},
            {2,4},
            
            {5,25},
            {3,9},
            {9,81},
            
            {8,64},
            {4,16},
            {7,49},
        };
    }

    @Test(dataProvider="perimeterTestDP")
    public void perimeterTest(int size, int expected) {
        Square s = new Square(size);
        assertEquals(s.perimeter(), expected);
    }

    @DataProvider
    public Object[][] perimeterTestDP() {
        return new Object[][] {
            {0,0},
            {1,4},
            
            {3,12},
            {4,16},            
            {6,24},
            {7,28},
            {8,32},
            {9,36},
        };
    }

}
