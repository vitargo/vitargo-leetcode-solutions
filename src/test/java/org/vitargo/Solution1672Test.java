package org.vitargo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Solution1672Test {
    Solution1672 solution1672;

    @BeforeEach
    void setUp() {
        solution1672 = new Solution1672();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void myMaximumWealthCase1() {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        int exp = 6;
        int act = solution1672.myMaximumWealth(arr);
        Assertions.assertEquals(exp, act);
    }

    @Test
    void myMaximumWealthCase2() {
        int[][] arr = {{1, 5}, {7, 3}, {3, 5}};
        int exp = 10;
        int act = solution1672.myMaximumWealth(arr);
        Assertions.assertEquals(exp, act);
    }

    @Test
    void myMaximumWealthCase3() {
        int[][] arr = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int exp = 17;
        int act = solution1672.myMaximumWealth(arr);
        Assertions.assertEquals(exp, act);
    }
}