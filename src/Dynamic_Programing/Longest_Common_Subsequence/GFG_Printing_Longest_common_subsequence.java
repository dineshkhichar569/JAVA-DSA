package Dynamic_Programing.Longest_Common_Subsequence;

public class GFG_Printing_Longest_common_subsequence {
    public static String lcs(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n+1][m+1];
        String str = "";

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if(i == 0 || j == 0) dp[i][j] = 0;
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        System.out.println(dp[n][m]);

        int i = n;
        int j = m;
        while (i>0 || j>0){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                str = str + s1.charAt(i-1);
                i--;
                j--;
            }else {
                if(dp[i][j-1] > dp[i-1][j]){
                    j--;
                }else {
                    i--;
                }
            }
        }

        String reversedStr = "";
        for (int k = str.length()-1; k >= 0 ; k--) {
            reversedStr = reversedStr + str.charAt(k);
        }
        return reversedStr;
    }

    public static void main(String[] args) {
        String s1 = "ABCDE";
        String s2 = "ABFCE";

        System.out.println(lcs(s1, s2));
    }
}
