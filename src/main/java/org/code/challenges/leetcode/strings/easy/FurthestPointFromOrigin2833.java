package org.code.challenges.leetcode.strings.easy;

public class FurthestPointFromOrigin2833 {
    public int furthestDistanceFromOrigin(String moves) {
        int L = 0, R = 0, D = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'L') {
                L++;
            } else if (c == 'R') {
                R++;
            } else {
                D++;
            }
        }
        return Math.abs(L - R) + D;
    }
}
