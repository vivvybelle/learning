package org.vivan.lists;

public class Fibonacci {

    public static int calculate(int in) {
        if (0 == in) {
            return 0;
        } else if (1 == in) {
            return 1;
        } else {
            return calculate(in - 1) + calculate(in - 2);
        }
    }
}
