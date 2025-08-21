package Dynamic_Programing.Knapsack;

public class Count_no_of_subsets_with_given_difference {
    public static int subset(int[] arr, int diff){
        int n = arr.length;
        int s = 0;
        for (int i = 0; i < n; i++) {
            s = s + arr[i];
        }
        
        int sum = (diff + s)/2;
        int[][] dp = new int[n+1][sum+1];

        return count(arr, sum, n, dp);
    }
    private static int count(int[] arr, int sum, int n, int[][] dp){
        /////  initialization
        if(n == 0 && sum > 0) return 0;
        if(sum == 0) return 1;

        if(arr[n-1] > sum){
            return dp[n][sum] = count(arr, sum, n-1, dp);
        } else if (arr[n-1] <= sum) {
            return dp[n][sum] = count(arr, sum-arr[n-1], n-1, dp)
                                         +
                                count(arr, sum, n-1, dp);
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] arr = {1};
        int diff = 2;
        System.out.println(subset(arr, diff));
    }
}
