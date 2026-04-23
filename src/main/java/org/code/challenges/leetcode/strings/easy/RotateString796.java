package org.code.challenges.leetcode.strings.easy;

public class RotateString796 {

    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            return true;
        }
        int n = goal.length();

        for (int rotation = 1; rotation < n; rotation++) {
            boolean match = true;

            for (int i = 0; i < n; i++) {
                if (goal.charAt(i) != s.charAt((i + rotation) % n)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            }

        }

        return false;

    }

}
