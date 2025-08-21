package Java.Recursion_level;

public class LC_231_Power_of_Two {
    public static boolean power(int n){

        if(n == 0){
            return false;
        }

        while (n != 1 && n != 0){
            int rem = n%2;

            if(rem != 0){
                return false;
            }
            n = n/2;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 0;

        System.out.println(power(n));
    }
}
