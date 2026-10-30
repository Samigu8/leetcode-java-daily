package com.samigu8.leetcode.easy.twosum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private final TwoSum solution = new TwoSum();

    @Test
    void exampleOne() {
        int[] result =
                solution.twoSum(new int[]{2, 7, 11, 15}, 9);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void exampleTwo() {
        int[] result =
                solution.twoSum(new int[]{3, 2, 4}, 6);

        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void exampleThree() {
        int[] result =
                solution.twoSum(new int[]{3, 3}, 6);

        assertArrayEquals(new int[]{0, 1}, result);
    }
}