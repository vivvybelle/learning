package org.vivan.tests;

import lombok.Value;

@Value
public class Multiplier {
    int multiple;
    
    public int multiply(int in) {
        return in * multiple;
    }
}
