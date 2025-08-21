package Java.Recursion_Interview_Questions;

public class LC_263_Ugly_Number {

    public static boolean primeNo(int n){
        if (n<=0) return false;
        while (n%2 == 0) n /= 2;
        while (n%3 == 0) n /= 3;
        while (n%5 == 0) n /= 5;
        if(n==1){
            return true;
        }
        return false;
    }

    public static void main (String[]args){
        int n = 1;
        System.out.println(primeNo(n));
    }
}
