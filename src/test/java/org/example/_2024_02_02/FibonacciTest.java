package org.example._2024_02_02;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void getSequenceFor() {
        //given
        int number = 5;
        int[] expected = {0,1,1,2,3};

        //when
        int[] actual = new Fibonacci(number).getSequenceFor();

        //then
        Assertions.assertArrayEquals(expected, actual);
    }
}