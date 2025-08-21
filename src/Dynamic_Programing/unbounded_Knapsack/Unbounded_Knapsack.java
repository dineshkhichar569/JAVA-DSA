package Dynamic_Programing.unbounded_Knapsack;

public class Unbounded_Knapsack {
    public static int unbounded(int[] wt, int[] val, int W){
        int n = wt.length;
        int dp[][] = new int[n+1][W+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < W+1; j++) {
                dp[i][j] = -1;
            }
        }
         return unKnapsack(wt, val, W, n, dp);
    }
    private static int unKnapsack(int[] wt, int[] val, int W, int n, int[][] dp){
        if(n == 0 || W == 0) return 0;

        if(dp[n][W] != -1) return dp[n][W];

        if(wt[n-1] > W){
            return dp[n][W] = unKnapsack(wt, val, W, n-1, dp);
        } else if (wt[n-1] <= W) {
            return dp[n][W] = Math.max(val[n-1] + unKnapsack(wt, val, W-wt[n-1], n, dp),
                                         unKnapsack(wt, val, W, n-1, dp)
            );
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] wt = {2,4,6};
        int[] val = {5,11,13};
        int W = 10;
        System.out.println(unbounded(wt, val, W));
    }
}
