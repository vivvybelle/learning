package org.vivan.experiments;

import lombok.Value;

@Value
public class Square {
    int size;

    public int area() {
        return size * size;
    }

    public int perimeter() {
        return (size * 4);
    }

}
