package com.dharme;

import java.util.stream.Stream;

public class Dumb {
    public int sum(Integer... numbers){
        return Stream.of(numbers).mapToInt(i -> i).sum();
    }

    public int[] getNumbers(int... numbers) {
        return numbers;
    }
}
