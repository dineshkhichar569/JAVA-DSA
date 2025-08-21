package Java.Recursion_level;

public class LC_231_Power_of_Three {
    public static boolean power(int n){

        if(n == 0){
            return false;
        }

        while (n != 1 && n != 0){
            int rem = n%3;

            if(rem != 0){
                return false;
            }
            n = n/3;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 27;

        System.out.println(power(n));
    }
}
