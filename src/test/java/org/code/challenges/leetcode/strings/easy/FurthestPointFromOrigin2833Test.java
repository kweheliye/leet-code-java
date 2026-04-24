package org.code.challenges.leetcode.strings.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FurthestPointFromOrigin2833Test {
    private final FurthestPointFromOrigin2833 solution = new FurthestPointFromOrigin2833();

    @Test
    public void furthestDistanceFromOrigin_onlyLeftMoves_returnsDistance(){
        assertEquals(5, solution.furthestDistanceFromOrigin("LLLLL"));
    }

    @Test
    public void furthestDistanceFromOrigin_onlyRightMoves_returnsDistance(){
        assertEquals(4, solution.furthestDistanceFromOrigin("RRRR"));
    }

    @Test
    void furthestDistanceFromOrigin_balancedLeftRight_returnsZero() {
        assertEquals(0, solution.furthestDistanceFromOrigin("LRLR"));
    }



}