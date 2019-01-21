package com.codecool;

import java.util.function.Supplier;

public class Fibonacci implements Supplier<Integer> {
    private int prev = 1;
    private int curr = 1;

    @Override
    public Integer get() {
        return calculateNext();
    }

    private Integer calculateNext(){
        int result = curr;

        int tmp = curr;
        curr = prev + tmp;
        prev = tmp;

        return result;
    }
}
