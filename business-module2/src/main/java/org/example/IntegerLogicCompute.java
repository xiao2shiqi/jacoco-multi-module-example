package org.example;

public class IntegerLogicCompute {

    public int increment(Integer i) {
        return i + 1;
    }

    public int decrement(Integer i) {
        return i- 1;
    }

    public boolean equals(Integer i, Integer j) {
        if (i < 127 && j < 127) {
            return i == j;
        }
        return i.equals(j);
    }
}
