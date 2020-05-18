package org.vivan.shapes;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CircleTest {

    @Test(dataProvider="areaTestDP")
    public void areaTest(int radius, float expected) {
        Circle c = new Circle(radius);
        assertEquals(c.area(), expected);
    }
    
    @DataProvider
    public Object[][] areaTestDP() {
        return new Object[][] {
            {0, 0.0f },
            {1, Circle.pi },
            {2, 12.56f },
            
            {7, 153.86002f },
        };
    }


        public void perimeterTest(int radius, float expected) {
            Circle c = new Circle(radius);
            assertEquals(c.perimeter(), expected);
        }

        @DataProvider
        public Object[][] perimeterTestDP() {
            return new Object[][] {
                {0, 0},
                {16.28 },
                {2, 12.56},
                
                {7, 43.96 },
            };
        }
    }