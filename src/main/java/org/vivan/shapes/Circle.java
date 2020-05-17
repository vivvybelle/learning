package org.vivan.shapes;

import lombok.Value;

@Value
public class Circle implements Shape {
    int radius;
    
    public static final float pi = 3.14f;
    
    @Override
    public float area() {
        return pi * (float) Math.pow(radius, 2);
    }

    @Override
    public float perimeter() {
        return 2 * pi * radius;
    }


}
