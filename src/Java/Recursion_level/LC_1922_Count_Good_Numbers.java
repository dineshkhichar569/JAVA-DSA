package Java.Recursion_level;

public class LC_1922_Count_Good_Numbers {
    public static int countGoodNumbers(long n) {
        long MOD = 1000000007;  // modulo of 10^9 +

        long evenPlace = (n+1)/2;
        long oddPlace = n/2;

        long even = pow(5, evenPlace, MOD);
        long prime = pow(4, oddPlace, MOD);

        long ans = (even*prime)%MOD;

        return (int) ans;
    }

    public static long pow(long base, long x, long MOD){
        long result = 1;
        while(x > 0){
            if(x%2==1){
                result = (result*base)%MOD;
            }
            base = (base*base) % MOD;
            x /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println(countGoodNumbers(n));
    }
}
