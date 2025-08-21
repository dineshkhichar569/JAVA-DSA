package Dynamic_Programing.Knapsack;

import java.util.Arrays;

public class LC_494_Target_Sum {
    public static int findTargetSumWays(int[] arr, int target) {
        int n = arr.length;
        int sumArr = 0;
        for (int i = 0; i < n; i++) {
            sumArr = sumArr + arr[i];
        }

        if(target < 0){
            target = target *(-1);
        }

        if((target + sumArr)%2 != 0) return 0;

        int sum = (target + sumArr)/2;

        int[][] dp = new int[n+1][sum+1];

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < sum+1; j++) {
                dp[i][j] = -1;
            }
        }
        return count(arr, sum, n, dp);
    }
    private static int count(int[] arr, int sum, int n, int[][] dp){
        if(n == 0 && sum > 0) return 0;
        if(sum == 0 && n == 0) return 1;
        if(dp[n][sum] != -1) return dp[n][sum];
        if(arr[n-1] > sum){
            return dp[n][sum] = count(arr, sum, n-1, dp);
        } else if (arr[n-1] <= sum) {
            return dp[n][sum] = count(arr, sum - arr[n-1], n-1, dp)
                                          +
                                count(arr, sum, n-1, dp);
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] arr = {0};
        int target = 0;
        System.out.println(findTargetSumWays(arr, target));
    }
}
