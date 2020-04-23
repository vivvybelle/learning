package org.vivan.tests;

import lombok.Value;

@Value
public class Adder {
    int additive;
    
    public int add(int in){
        return in + additive;
    }
}
