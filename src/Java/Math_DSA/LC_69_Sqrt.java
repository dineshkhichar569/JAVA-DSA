package Java.Math_DSA;

public class LC_69_Sqrt {
    public static int sqrt(int n){
        int s = 0;
        int e = n;

        while (s <= e){
            int m = s + (e - s)/2;

            if(m * m == n){
                return m;
            }
            if(m * m < n){
                s = m + 1;
            }else {
                e = m - 1;
            }
        }
        double root = 0.0;
        int decimalPlace = 10;
        double incr = 0.16 ;
        for (int i = 0; i < decimalPlace; i++) {
            while(root*root <= n){
                root = root + incr;
            }
            root = root - incr;
            incr = incr/10;
        }
        return (int)root;
    }

    public static void main(String[] args) {
        int n = 2147395600;

        System.out.println(sqrt(n));
    }
}
