package Dynamic_Programing.unbounded_Knapsack;

public class LC_518_Coin_Change2 {
    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int[][] dp = new int[n+1][amount+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < amount+1; j++) {
                dp[i][j] = -1;
            }
        }

        return change(coins, amount, n, dp);
    }
    private static int change(int[] coins, int amount, int n, int[][] dp){
        if(n == 0 && amount > 0) dp[n][amount] = 0;
        if(amount == 0) dp[n][amount] = 1;

        if(dp[n][amount] != -1) return dp[n][amount];

        if(coins[n-1] > amount){
            return dp[n][amount] = change(coins, amount, n-1, dp);
        } else if (coins[n-1] <= amount) {
            return dp[n][amount] = change(coins, amount-coins[n-1], n, dp) +
                    change(coins, amount, n-1, dp);
        }
        return dp[n][amount];
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
}
