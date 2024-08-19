package org.vitargo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Solution1480Test {

    private Solution1480 solution1480;

    @BeforeEach
    void setUp() {
        solution1480 = new Solution1480();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void runningSumCase1() {
        int[] nums = new int[]{1,2,3,4};
        int[] exp = new int[]{1,3,6,10};
        int[] act = solution1480.runningSum(nums);
        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    void runningSumCase2() {
        int[] nums = new int[]{1,1,1,1,1};
        int[] exp = new int[]{1,2,3,4,5};
        int[] act = solution1480.runningSum(nums);
        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    void runningSumCase3() {
        int[] nums = new int[]{3,1,2,10,1};
        int[] exp = new int[]{3,4,6,16,17};
        int[] act = solution1480.runningSum(nums);
        Assertions.assertArrayEquals(exp, act);
    }
}