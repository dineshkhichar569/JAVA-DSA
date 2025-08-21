package Dynamic_Programing.Knapsack;

import java.util.ArrayList;
import java.util.List;

public class Count_of_Subsets_Sum_with_a_Given_Sum {
    ///////////////////  Using only Recursion   ////////////////////////////////
    public static int countSubset(int[] arr, int sum){
        List<List<Integer>> matrix = new ArrayList<>();
        subset(arr, sum, 0, new ArrayList<>(), matrix);
        return matrix.size();
    }
    private static void subset(int[] arr, int sum, int i, List<Integer> list, List<List<Integer>> matrix){
        if(sum == 0){
            matrix.add(new ArrayList<>(list));
            return;
        }
        if (i >= arr.length || arr[i] > sum) return;
        List<Integer> include = new ArrayList<>(list);
        include.add(arr[i]);
        subset(arr, sum-arr[i], i+1, include, matrix);
        subset(arr, sum, i+1, list, matrix);
    }

    /////////////////// using DP ///////////////////////////////
    public static int Input(int[] arr, int sum){
        int n = arr.length;
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
        if(sum == 0) return 1;

        if(dp[n][sum] != -1) return dp[n][sum];

        if(arr[n-1] <= sum){
            return dp[n][sum] = (
                    count(arr, sum-arr[n-1], n-1, dp)
                             +
                    count(arr, sum, n-1, dp)
            );
        }
        return dp[n][sum] = count(arr, sum, n-1, dp);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,10};
        int sum = 10;
        System.out.println(Input(arr, sum));
    }
}
