package org.vivan.tests;

import lombok.Value;

@Value
public class Rectangle {
    int length,width;

    public int area() {
        return length * width;
    }
    public int perimeter(){
        return length + length + width + width;
    }
}
