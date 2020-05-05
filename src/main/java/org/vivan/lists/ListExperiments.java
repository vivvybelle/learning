package org.vivan.lists;

import io.vavr.collection.List;

public class ListExperiments {
    
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");
        names = names.append("David");
        System.out.println("names = " + names);
        
        System.out.println(List.of(null, null));
        
        System.out.println(names.length());
        
        System.out.println(upTo(5));
    }

    public static List<Integer> upTo(Integer in) {
        List<Integer> returnVal = List.empty();
        for (int i = 0; i < in; i++) {
            returnVal = returnVal.prepend(i);
        }
        return returnVal.reverse();
    }
}
