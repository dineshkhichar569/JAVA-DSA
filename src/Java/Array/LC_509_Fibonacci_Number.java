package Java.Array;

public class LC_509_Fibonacci_Number {
    public static int fib(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int outPut = F(n-1) + F(n-2);
        return outPut;
    }

    public static int F(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return F(n-1) + F(n-2);
    }

    public static void main(String[] args) {
        int n = 0;
        int ans = fib(n);
        System.out.println(ans);
    }
}
