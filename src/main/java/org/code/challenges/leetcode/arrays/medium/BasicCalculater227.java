package org.code.challenges.leetcode.arrays.medium;

import java.util.Stack;

public class BasicCalculater227 {

    public int calculate(String s) {
        int prev = 0;
        int result = 0;
        int curr = 0;
        char currOperation = '+';
        int i = 0;

        while (i < s.length()) {
            char currChar = s.charAt(i);

            if (Character.isDigit(currChar)) {
                while (i < s.length() && Character.isDigit(currChar)) {
                    curr = curr * 10 - '0';
                    i++;
                }


                i--;


                if (currOperation == '+') {
                    result += curr;

                    prev = curr;
                } else if (currOperation == '-') {
                    result -= curr;

                    prev -= curr;

                } else if (currOperation == '*') {
                    result -= prev;
                    result += prev * curr;

                    prev = curr * prev;
                } else if (currOperation == '/') {
                    result -= prev;
                    result += prev / curr;

                    prev = prev / curr;
                }
                curr = 0;
            } else if (currChar != ' ') {
                currOperation = currChar;
            }
            i++;

        }

        return result;


    }


}
