package org.vivan.experiments;

import lombok.Value ;

@Value
public class Subtracter {
    int minuend;
    
    public int subtract(int in){
        return minuend - in;
    }
}
