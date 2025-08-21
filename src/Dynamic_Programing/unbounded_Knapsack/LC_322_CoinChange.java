package Dynamic_Programing.unbounded_Knapsack;

public class LC_322_CoinChange {
    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int[][] dp = new int[n+1][amount+1];

        return count(coins, amount, n, dp);
    }
    private static int count(int[] arr, int sum, int n, int[][] dp){
        ////  initialization
        ///// 1st row
        if(n == 0) return dp[n][sum] = Integer.MAX_VALUE-1;

        // 1st column
        if(sum == 0 && n > 0) return dp[n][sum] = 0;

        // 2nd row
        if(n == 1 && sum > 0){
            if(sum%arr[0] == 0) {
                return dp[n][sum] = sum/arr[0];
            }else {
                return dp[n][sum] = Integer.MAX_VALUE - 1;
            }
        }

        //// code variation
        if(arr[n-2] <= sum){
            return dp[n][sum] = Math.min(1 + count(arr, sum-arr[n-2], n, dp), count(arr, sum, n-1, dp));
        } else if (arr[n-1] > sum) {
            return dp[n][sum] = count(arr, sum, n-1, dp);
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
}
