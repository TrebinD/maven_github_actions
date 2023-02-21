package com.trebin;

import java.util.stream.IntStream;

public class Main {
    public long findMax(long[] sales){
        long maxSale = 0;
        for (long sale:sales){
            if (sale>maxSale){
                maxSale = sale;
            }
        }
        return maxSale;
    }
}
