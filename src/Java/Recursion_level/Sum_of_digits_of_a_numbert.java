package Java.Recursion_level;

public class Sum_of_digits_of_a_numbert {

    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        int remainder = n % 10;
        n = n / 10;

        return remainder + sum(n);
    }

    public static void main(String[] args) {
        int n = 1342;
        System.out.println(sum(n));
    }
}
