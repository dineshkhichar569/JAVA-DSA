package Java.Recursion_level;

public class LC_279_PerfectSquares {
    public static int numSquares(int n) {
        int[] memo = new int[n+1];
        return Count(n, memo);
    }

    public static int Count(int n, int[] memo) {
        if(n < 0) return Integer.MAX_VALUE;
        if(n==0) return 0;

        if (memo[n] > 0) return memo[n];

        int minCount =  n;
        for (int i = 1; i*i <= n; i++) {
            int result = Count(n-(i*i), memo);
            minCount = Math.min(result, minCount);
        }
        memo[n] = minCount+1;
        return minCount+1;
    }


    public static void main(String[] args) {
        int n = 12;
        System.out.println(numSquares(n));
    }
}
