package org.vitargo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1342Test {
    Solution1342 solution1342;

    @BeforeEach
    void setUp() {
        solution1342 = new Solution1342();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void numberOfStepsCase1() {
        int num = 14;
        int exp = 6;
        int act = solution1342.numberOfSteps(num);
        Assertions.assertEquals(exp, act);
    }

    @Test
    void numberOfStepsCase2() {
        int num = 8;
        int exp = 4;
        int act = solution1342.numberOfSteps(num);
        Assertions.assertEquals(exp, act);
    }

    @Test
    void numberOfStepsCase3() {
        int num = 123;
        int exp = 12;
        int act = solution1342.numberOfSteps(num);
        Assertions.assertEquals(exp, act);
    }
}