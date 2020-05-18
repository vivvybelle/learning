package org.vivan.shapes;

import lombok.Value;

@Value
public class Square implements Shape {
    int size;

    @Override
    public float area() {
        return size * size;
    }

    @Override
    public float perimeter() {
        return (size * 4);
    }

}
