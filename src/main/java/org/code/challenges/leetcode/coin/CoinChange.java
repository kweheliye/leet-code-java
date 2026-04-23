package org.code.challenges.leetcode.coin;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);

        dp[0] = 0;
        for (int amt = 1; amt <= amount; amt++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= amt) {
                    dp[amt] = Math.min(dp[amt], dp[amt - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();

       System.out.println(coinChange.coinChange(new int[]{1, 2, 5}, 11));
    }


}
