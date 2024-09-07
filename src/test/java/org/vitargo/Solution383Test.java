package org.vitargo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution383Test {

    Solution383 solution383;

    @BeforeEach
    void setUp() {
        solution383 = new Solution383();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void myCanConstructCase1() {
        String ransomNote = "a";
        String magazine = "b";
        boolean act = solution383.myCanConstruct(ransomNote, magazine);
        Assertions.assertFalse(act);
    }

    @Test
    void myCanConstructCase2() {
        String ransomNote = "aa";
        String magazine = "ab";
        boolean act = solution383.myCanConstruct(ransomNote, magazine);
        Assertions.assertFalse(act);
    }

    @Test
    void myCanConstructCase3() {
        String ransomNote = "aa";
        String magazine = "aab";
        boolean act = solution383.myCanConstruct(ransomNote, magazine);
        Assertions.assertTrue(act);
    }

    @Test
    void hashMapCanConstructCase1() {
        String ransomNote = "a";
        String magazine = "b";
        boolean act = solution383.hashMapCanConstruct(ransomNote, magazine);
        Assertions.assertFalse(act);
    }

    @Test
    void hashMapCanConstructCase2() {
        String ransomNote = "aa";
        String magazine = "ab";
        boolean act = solution383.hashMapCanConstruct(ransomNote, magazine);
        Assertions.assertFalse(act);
    }

    @Test
    void hashMapCanConstructCase3() {
        String ransomNote = "aa";
        String magazine = "aab";
        boolean act = solution383.hashMapCanConstruct(ransomNote, magazine);
        Assertions.assertTrue(act);
    }
}