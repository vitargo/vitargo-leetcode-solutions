package org.vitargo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution412Test {

    Solution412 solution412;

    @BeforeEach
    void setUp() {
        solution412 = new Solution412();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void fizzBuzzCase1() {
        int i = 3;
        List<String> exp = List.of("1","2","Fizz");
        List<String> act = solution412.fizzBuzz(i);
        Assertions.assertEquals(exp, act);
    }

    @Test
    void fizzBuzzCase2() {
        int i = 5;
        List<String> exp = List.of("1","2","Fizz","4","Buzz");
        List<String> act = solution412.fizzBuzz(i);
        Assertions.assertEquals(exp, act);
    }

    @Test
    void fizzBuzzCase3() {
        int i = 15;
        List<String> exp = List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");
        List<String> act = solution412.fizzBuzz(i);
        Assertions.assertEquals(exp, act);
    }
}