package DSA_Sheets.Recursion;

public class LC_1922_Count_Good_Numbers {

    private static long MOD = 1000000007;

    public static int countGoodNumbers(long n) {
        long even = (n%2==0 ? n/2 : (n/2)+1);
        long odd = n/2;

        long evenNo = Pow(5, even);
        long primeNo = Pow(4, odd);

        long ans = (evenNo * primeNo) % MOD;
        return (int) ans;
    }
//    public static long Pow(long base, long power){
//        if(power == 0) return 1;
//        long result = Pow(base, power/2);
//        if(power % 2 == 0){
//            return (result * result) % MOD;
//        }
//        return (result * result * base) % MOD;
//    }

public static long Pow(long base, long power){
    if(power == 0) return 1;
    long result = 1;
    while (power > 0){
        if(power % 2 == 1){
            result = (result * base) % MOD;
        }
        base = (base * base) % MOD;
        power /= 2;
    }
    return result;
}


    public static void main(String[] args) {
        long n = 50;
        System.out.println(countGoodNumbers(n));
    }
}
