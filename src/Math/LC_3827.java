package Math;

public class LC_3827 {
    public static boolean isMonobit(String s){
        boolean isTrue = false;

        if(s.length() == 1){
            return true;
        }

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i)){
                isTrue = true;
            } else{
                return false;
            }
        }

        return isTrue;
    }

    public static int countMonobit(int n) {
        int count = 0;

        for(int i = 0; i <= n; i++){
            if(isMonobit(Integer.toBinaryString(i))){
                count++;
            }
        }

        return count;
    }

    static void main() {
        int n = 6;
        System.out.println(countMonobit(n));
    }
}
