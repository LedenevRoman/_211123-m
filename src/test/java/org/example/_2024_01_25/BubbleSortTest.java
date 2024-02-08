package org.example._2024_01_25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void bubbleSortTest() {
        //given
        int[] array = {1, 9, 2, 8, 3, 7, 4, 5};
        int[] expected = {1, 2, 3, 4, 5, 7, 8, 9};

        //when
        BubbleSort.bubbleSort(array);

        //then
        Assertions.assertArrayEquals(expected, array);
    }

}