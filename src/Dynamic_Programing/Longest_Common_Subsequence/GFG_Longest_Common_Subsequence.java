package Dynamic_Programing.Longest_Common_Subsequence;

public class GFG_Longest_Common_Subsequence {

    public static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n == 0 || m == 0) return 0;

        int[][] dp = new int[n+1][m+1];

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                dp[i][j] = -1;
            }
        }

//        return countRecursion(s1, s2, n, m);
        return countMemo(s1, s2, n, m, dp);
    }

    /////////// using recursion but not valid for all test cases ////////////
    private static int countRecursion(String x, String y, int n, int m){
        if(n == 0 || m == 0) return 0;

        if(x.charAt(n-1) == y.charAt(m-1)){
            return 1 + countRecursion(x, y, n-1, m-1);
        } else{
            return Math.max(countRecursion(x, y, n, m-1), countRecursion(x, y, n-1, m));
        }
    }

    ////////// using memoization  //////////////
    private static int countMemo(String x, String y, int n, int m, int[][] dp){
        if(n == 0 || m == 0) return dp[n][m] = 0;

        if(dp[n][m] != -1) return dp[n][m];

        if(x.charAt(n-1) == y.charAt(m-1)){
            return dp[n][m] = 1 + countMemo(x, y, n-1, m-1, dp);
        } else {
            return dp[n][m] = Math.max(countMemo(x, y, n, m-1, dp), countMemo(x, y, n-1, m, dp));
        }
    }

    public static void main(String[] args) {
        String s1 = "pmjghexybyrgzczy";
        String s2 = "hafcdqbgncrcbihkd";

        System.out.println(lcs(s1, s2));
    }
}
