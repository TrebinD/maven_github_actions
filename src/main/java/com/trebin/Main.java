package com.trebin;

import java.util.stream.IntStream;

public class Main {
    public int summa (int[] values){
        return IntStream.of(values).sum();
    }
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Test GitHub Actions");

    }
}
