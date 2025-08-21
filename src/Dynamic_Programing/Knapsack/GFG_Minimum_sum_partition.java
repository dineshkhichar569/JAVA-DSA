package Dynamic_Programing.Knapsack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GFG_Minimum_sum_partition {
    public static int minDifference(int arr[]){
        int n = arr.length;
        int range = 0;
        for (int i = 0; i < n; i++) {
            range = range + arr[i];
        }

        Boolean[][] dp = new Boolean[n+1][range+1];
        subsetSum(arr, range, n, dp);
        List<Integer> minimun = new ArrayList<>();
        for (int i = 0; i <= range/2; i++) {
            if(dp[n][i] == true){
                minimun.add(range - (2*i));
            }
        }

        return Collections.min(minimun);
    }
    private static void subsetSum(int[] arr, int range, int n, Boolean[][] dp){
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < range+1; j++) {
                if(i == 0 && j > 0) dp[i][j] = false;
                if(j == 0) dp[i][j] = true;
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < range+1; j++) {
                if(arr[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3};
        System.out.println(minDifference(arr));
    }
}
