package org.vivan.shapes;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.vivan.shapes.Rectangle;

public class RectangleTest<area> {

    @Test(dataProvider="areaTestDP")
    public void areaTest(int length,int width, int expected) {
        Rectangle r = new Rectangle(width,length);
        assertEquals(r.area(), expected);
    }

    @DataProvider
    public Object[][] areaTestDP() {
        return new Object[][] {
            {0,0,0},
            {0,6,0},
            {6,0,0},
            
            {4,5,20},
            {3,4,12},
            {1,9,9},
            
            {3,3,9},
            {4,2,8},
            {2,2,4},
        };
    }

    @Test(dataProvider="perimeterTestDP")
    public void perimeterTest(int length,int width, int expected) {
        Rectangle r = new Rectangle(width,length);
        assertEquals(r.perimeter(), expected);
    }

    @DataProvider
    public Object[][] perimeterTestDP() {
        return new Object[][] {
            {0,0,0},
            {0,6,12},
            {6,0,12},
            
            {4,5,18},
            {3,4,14},
            {1,9,20},
            
            {3,3,12},
            {1,3,8},
            {2,2,8},
        };
    }
}
