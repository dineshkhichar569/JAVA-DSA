package Java.Recursion_level;

public class Nto1_and_1toN {

    public static void fun(int n){
        if(n == 0){
            return;
        }

        System.out.print(n + " ");
        fun(n-1);
    }
    public static void funReverse(int n){
        if(n == 0){
            return;
        }
        funReverse(n-1);
        System.out.print(n + " ");
    }
    public static void funBoth(int n){
        if(n == 0){
            return;
        }

        System.out.print(n + " ");
        funBoth(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        fun(n);
        System.out.println(" ");
        funReverse(n);
        System.out.println(" ");
        funBoth(n);
    }
}
