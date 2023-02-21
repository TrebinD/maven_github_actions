package com.trebin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void shouldSumma(){
        Main main = new Main();
        int[] values = {1,2,3,4,5,6,7,8,9};
        int expected = 45;
        int actual = main.summa(values);
        assertEquals(expected,actual);

    }

}