package org.vivan.experiments;

import lombok.Value;

@Value
public class Rectangle {
    int length;
    int width;

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return (length * 2) + (width * 2);
    }
}
