package DSA_Sheets.Recursion;

public class LC_8_String_to_Integer {
    public static int myAtoi(String s) {
        s = s.trim();
        int ans = 1;
        long result = 0;
        String num = "";
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - '0';
            if (ch >= -5 && ch <= 9) {
                if (s.charAt(0)=='-' && ch == -3) {
                    ans = -ans;
                } else if (ch>= 0 && ch <= 9){
                    num = num + s.charAt(i);
//                    result = result * 10 + ch;
                }else {
                    break;
                }
            }else {
                break;
            }
        }
        num = num.trim();
        result = Long.parseLong(num);
        result = ans * result;

        int min = Integer.MIN_VALUE; // -2147483648
        int max = Integer.MAX_VALUE; // 2147483647

        if(result < min) return min;
        if(result > max) return max;

        return (int) result;
    }

    public static int myAtoi2(String s) {
        s = s.trim();
        if(s.isEmpty()) return 0;

        int i = 0;
        int sign = 1;
        long ans = 0;
        if(s.charAt(i)=='-' ||s.charAt(i)=='+'){
            sign = (s.charAt(i)=='-') ? (-1) : (1);
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))==true){
            int a = s.charAt(i) - '0';
            ans = (ans * 10) + a;

            if(sign*ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(sign*ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        return (int) (sign*ans);
    }

    public static void main(String[] args) {
        String s = "-91283472332";
        System.out.println(myAtoi2(s));
    }
}
