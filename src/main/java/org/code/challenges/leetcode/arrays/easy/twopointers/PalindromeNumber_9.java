package org.code.challenges.leetcode.arrays.easy.twopointers;

import java.util.List;

public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {

        String s = String.valueOf(x);
        int p1 = 0, p2 = s.length() - 1;
        while (p1 < p2) {
            if (s.charAt(p1) != s.charAt(p2)) {
                return false;
            }
            p1++;
            p2--;
        }

        return true;
    }
}
