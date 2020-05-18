package org.vivan.experiments;

import lombok.Value ;

@Value
public class Divider {
    int divitend;
    
    public int divide (int in){
        return divitend / in;
    }    
}
