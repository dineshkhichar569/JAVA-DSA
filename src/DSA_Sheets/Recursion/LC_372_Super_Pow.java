package DSA_Sheets.Recursion;

public class LC_372_Super_Pow {
    public static int superPow(int a, int[] b) {
        int MOD = 1337;

        int num = 0;
        int i = 0;
        while(i < b.length){
            num = ((num * 10) + b[i]) % MOD;
            i++;
        }
        System.out.println(num);

        long power = num;
        long base = a;
        long ans = 1;
        while (power > 0){
            if(power%2==1){
                ans = (ans * base) % MOD;
            }
            base = (base * base) % MOD;
            power = power/2;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int a = 2147483647;
        int[] b = {1,7,6,3,4,3,4,1,6,8,4,2,5};
        System.out.println(superPow(a, b));
    }
}
