package com.trebin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void shouldSumma(){
        Main main = new Main();
        long[] values = {1,2,3,4,5,6,7,8,9};
        long expected = 9;
        long actual = main.findMax(values);
        assertEquals(expected,actual);

    }
    @Test
    void shouldIfSum(){
        Main main = new Main();
        long[] values = {1,2,3,4,5,6,7,8,9};
        long expected = 9;
        long actual = main.findMax(values);
        assertEquals(expected,actual);

    }

}