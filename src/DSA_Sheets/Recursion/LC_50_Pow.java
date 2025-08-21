package DSA_Sheets.Recursion;

public class LC_50_Pow {
    public static double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        long i = n;
        if(i < 0){
            x = 1/x;
            i = -i;
        }
        double ans = 1.0;
        while (i > 0){
            if(i % 2 == 1){
                ans = ans * x;
            }
            x = x * x;
            i = i/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        double x = 2;
        int n = 10;
        System.out.println(myPow(x, n));
    }
}
