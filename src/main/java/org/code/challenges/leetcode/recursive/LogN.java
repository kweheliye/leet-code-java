package org.code.challenges.leetcode.recursive;

// O(Log n) Time Complexity,
public class LogN {

    // O(Log n) Func , n = 8 Log base 2 of 8 = 3
    public static int fib(int n) {
        if (n == 0 || n ==1)
            return n;

        if(n == 4){
            System.out.println("");
            return 0;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
