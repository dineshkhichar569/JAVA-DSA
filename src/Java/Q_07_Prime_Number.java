package Java;

import OOPS.Sunny.static_example.Main;

public class Q_07_Prime_Number {
    public static void main(String[] args) {
        System.out.println(isPrime(12));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c <= Math.sqrt(n)) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}