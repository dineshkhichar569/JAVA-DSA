package Dynamic_Programing.unbounded_Knapsack;

import java.util.Arrays;

public class GFG_Rod_Cutting {
    public static int cutRod(int[] price) {
        int n = price.length;
        int[] length = new int[n];
        int in = 1;
        for (int i = 0; i < n; i++) {
            length[i] = in;
            in++;
        }

        int[][] dp = new int[n+1][n+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < n+1; j++) {
                dp[i][j] = -1;
            }
        }

        return rod(length, price, n, n, dp);
    }
    private static int rod(int[] length, int[] price , int N, int n, int[][] dp){
        if(n == 0 || N == 0) return 0;

        if(dp[n][N] != -1) return dp[n][N];

        if(length[n-1] <= N){
            return dp[n][N] = Math.max(price[n-1] + rod(length, price, N-length[n-1], n, dp),
                                                    rod(length, price, N, n-1, dp)
                    );
        } else if (length[n-1] > N) {
            return dp[n][N] = rod(length, price, N, n-1, dp);
        }
        return dp[n][N];
    }

    public static void main(String[] args) {
        int[] price = {3, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(cutRod(price));
    }
}
