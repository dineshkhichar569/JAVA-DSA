package Sliding_Window;

public class LC_1876 {
    public static boolean checkDuplicate(String s){
        if(s.charAt(0) == s.charAt(1) || s.charAt(1) == s.charAt(2) || s.charAt(0) == s.charAt(2)){
            return false;
        }

        return true;
    }

    public static int countGoodSubstrings(String s) {
        int k = 3;
        int i = 0;
        int j = 0;
        StringBuilder str = new StringBuilder(k);
        int ans = 0;
        while(j < s.length()){
            str.append(s.charAt(j));
            if(j-i+1 == k){
                if(checkDuplicate(str.toString()) == true){
                    ans++;
                }
                str.deleteCharAt(0);
                i++;
            }
            j++;
        }
        return ans;
    }

    static void main() {
        System.out.println(countGoodSubstrings("aababcabc"));
    }
}
