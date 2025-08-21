package Dynamic_Programing.Knapsack;

public class _01_Knapsack {
    public static int Memoization(int[] wt, int[] val, int W){
        int n = wt.length;
        int[][] dp = new int[n+1][W+1];

        /// initially all value of dp matrix are => -1
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                dp[i][j] = -1;
            }
        }
        return knapsack(wt, val, W, n, dp);
    }
    public static int knapsack(int[] wt, int[] val, int W, int n, int[][] dp){
        // base Condition
        if(n == 0 || W == 0){
            return 0;
        }
        if(dp[n][W] != -1) return dp[n][W];

        if(wt[n-1] > W){
            /// Not Pick
            return dp[n][W] = knapsack(wt, val, W, n-1, dp);
        }
        return dp[n][W] = Math.max(
          val[n-1] + knapsack(wt, val, W-wt[n-1], n-1, dp), // Pick
                knapsack(wt, val, W, n-1, dp)  // Not Pick
        );
    }

    public static int topDown(int[] wt, int[] val, int W){
        int n = wt.length;
        int[][] dp = new int[n+1][W+1];

        //// Initilization
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < W+1; j++) {
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        // Choice Diagram
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < W+1; j++) {
                if(wt[i-1] <= j){
                    dp[i][j] = Math.max(
                            val[i-1] + dp[i-1][j-wt[i-1]],
                            dp[i-1][j]
                    );
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] wt = {2,4,6};
        int[] val = {5,11,13};
        int W = 10;

        System.out.println(Memoization(wt, val, W));
    }
}
