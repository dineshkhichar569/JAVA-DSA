package Java.Math_DSA;

public class lessThan_PrimeNumbers {
    public static boolean prime(int i){
        if(i <= 1){
            return false;
        }

        int c = 2;
        while(c*c <= i){
            if(i % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 40;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(prime(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("number of prime integers : " +count);
    }
}
