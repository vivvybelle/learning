package org.vivan.shapes;

import lombok.Value;

@Value
public class Rectangle implements Shape {
    int length;
    int width;

    @Override
    public float area() {
        return length * width;
    }

    @Override
    public float perimeter() {
        return (length * 2) + (width * 2);
    }
}
