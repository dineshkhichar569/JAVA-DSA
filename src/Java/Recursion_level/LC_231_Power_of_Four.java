package Java.Recursion_level;

public class LC_231_Power_of_Four {
    public static boolean power(int n){

        if(n == 0){
            return false;
        }

        while (n != 1 && n != 0){
            int rem = n%4;

            if(rem != 0){
                return false;
            }
            n = n/4;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 64;

        System.out.println(power(n));
    }
}
