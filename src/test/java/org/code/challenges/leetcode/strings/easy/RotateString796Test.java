package org.code.challenges.leetcode.strings.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateString796Test {
    RotateString796 solution;

    @BeforeEach
    public void setUp() {
       solution = new RotateString796();
    }

    @Test
    public void rotateString_validRotations_returnsTrue() {
        assertTrue(solution.rotateString("abcde", "cdeab"));
    }

    @Test
    public void rotateString_invalidRotation_returnsFalse() {
        assertTrue(solution.rotateString("abcde", "cdeab"));
    }

    @Test
    public void rotateString_differentLength_returnsFalse(){
        assertFalse(solution.rotateString("abc" , "abbc"));
    }

}