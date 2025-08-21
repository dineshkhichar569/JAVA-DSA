package Dynamic_Programing.Knapsack;

public class LC_416Partition_Equal_Subset_Sum {

    public static boolean canPartition(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        if(sum % 2 == 1) return false;
        // else
        int s = sum / 2;
        int n = arr.length;
        Boolean[][] dp = new Boolean[n + 1][s + 1];

        return evenSum(arr, s, n, dp);
    }

    public static Boolean evenSum(int[] arr, int sum, int n, Boolean[][] dp){
        //initialization
        if(n == 0) return false;
        if(sum == 0) return true;

        // Check if the result already computed
        if (dp[n][sum] != null) return true;

        // Choice Diagram
        if(arr[n-1] <= sum){
            return dp[n][sum] = evenSum(arr, sum-arr[n-1], n-1, dp)
                    ||
                    evenSum(arr, sum, n-1, dp);
        }else {
            return dp[n][sum] = evenSum(arr, sum, n-1, dp);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1};
        System.out.println(canPartition(arr));
    }
}
