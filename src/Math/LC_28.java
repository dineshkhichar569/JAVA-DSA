package Math;

public class LC_28 {
    public static int strStr(String haystack, String needle) {
//        if(haystack.charAt(0) == needle.charAt(0)) return 0;

        if(needle.length() == 0) return 0;

        int j = 0;
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
            } else{
                j = 0;
                if(haystack.charAt(i) == needle.charAt(j)) {
                    j++;
                }
            }

            if(j == needle.length()){
                return i-j+1;
            }
        }

        return -1;
    }

    static void main() {
        String A = "mississippi";
        String B = "issip";

        System.out.println(strStr(A, B));
    }
}
