package Java.Recursion_level;

public class LC_50_Pow {
    public static double myPow(double x, int n) {
        if(x == 1.0 || n == 0){
            return 1.0;
        }

        if(x == -1){
            return (n%2==0) ? 1.0 : -1.0;
        }
    
        if(n < -100 && x != -1.0){
            return 0.00;
        }

        if(n < 0){
            x = 1/x;
            n *= -1;
        }
        double mutiply = x;
        while (n != 1){
            x = x * mutiply;
            n--;
        }
        return x;
    }

    public static void main(String[] args) {
        double x = -1.00000 ;
        int n = 0;
        System.out.println(myPow(x, n));
    }
}
