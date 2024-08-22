package org.vitargo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution876Test {

    Solution876 solution876;

    @BeforeEach
    void setUp() {
        solution876 = new Solution876();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void middleNodeCase1() {
        Solution876.ListNode next5 = new Solution876.ListNode(5);
        Solution876.ListNode next4 = new Solution876.ListNode(4, next5);
        Solution876.ListNode next3 = new Solution876.ListNode(3, next4);
        Solution876.ListNode next2 = new Solution876.ListNode(2, next3);
        Solution876.ListNode head = new Solution876.ListNode(1, next2);
        Solution876.ListNode act = solution876.middleNode(head);
        Solution876.ListNode exp = next3;
        Assertions.assertEquals(exp, act);
    }

    @Test
    void middleNodeCase2() {
        Solution876.ListNode next6 = new Solution876.ListNode(6);
        Solution876.ListNode next5 = new Solution876.ListNode(5, next6);
        Solution876.ListNode next4 = new Solution876.ListNode(4, next5);
        Solution876.ListNode next3 = new Solution876.ListNode(3, next4);
        Solution876.ListNode next2 = new Solution876.ListNode(2, next3);
        Solution876.ListNode head = new Solution876.ListNode(1, next2);
        Solution876.ListNode act = solution876.middleNode(head);
        Solution876.ListNode exp = next4;
        Assertions.assertEquals(exp, act);
    }
}