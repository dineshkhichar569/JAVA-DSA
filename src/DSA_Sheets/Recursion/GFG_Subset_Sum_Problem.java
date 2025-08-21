package DSA_Sheets.Recursion;

public class GFG_Subset_Sum_Problem {
    public static Boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        boolean[][] dp = new boolean[n+1][sum+1];
        ///Initialization
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < sum+1; j++) {
                if(j == 0){
                    dp[i][j] = true;
                }
                if(i == 0 || j > 0){
                    dp[i][j] = false;
                }
            }
            ///// choice diagram
            for (int k = 1; k < n+1; k++) {
                for (int l = 1; l < sum+1; l++) {
                    if(arr[k-1] <= l){
                        dp[k][l] = dp[k-1][l-arr[k-1]] || dp[k-1][l];
                    }else {
                        dp[k][l] = dp[k-1][l];
                    }
                }
            }
        }
        return dp[n][sum];
    }


    public static Boolean isSubsetSum2(int arr[], int sum){
        int n = arr.length;
        Boolean[][] dp = new Boolean[n+1][sum+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                dp[i][j] = false;
            }
        }
        return Subset(arr, sum, n, dp);
    }
    public static Boolean Subset(int arr[], int sum, int n, Boolean[][] dp){
        if(n == 0 && sum > 0) return false;
        if(sum == 0) return true;

        if(arr[n-1] > sum){
            return dp[n][sum] = Subset(arr, sum, n-1, dp);
        }
        return dp[n][sum] = Subset(arr, sum-arr[n-1], n-1, dp) || Subset(arr, sum, n-1, dp);
    }


    public static void main(String[] args) {
        int arr[] = {3, 34, 4, 12, 5, 2};
        int sum = 20;
        System.out.println(isSubsetSum2(arr, sum));
    }
}
