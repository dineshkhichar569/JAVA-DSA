package Java;

public class Q_08_Armstrong_Number {
    public static void main(String[] args) {
        armstrong(153);
    }
    static void armstrong(int n){
        int real = n;
        String str = String.valueOf(n);
        int digits = str.length();
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            sum = sum + (int)Math.pow(rem, digits);
            n = n/10;
        }
        if(sum == real){
            System.out.println(real + " Armstrong Number.");
        }else {
            System.out.println("Not.");
        }
    }
}
