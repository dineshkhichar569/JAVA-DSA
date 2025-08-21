package Java.Math_DSA;

public class LC_7_Reverse_Integer {
    public static int reverse(int x) {
        long result = 0;
        while(x != 0){
            int rem = x % 10;

            result = (result * 10) + rem;

            x = x/10;
        }
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));
    }
}