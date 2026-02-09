package College_Brain_Mentors.Recursion;

public class LC_70 {
    static int c = 0;
    public static void count(int n){
        if(n < 0){
            return;
        }
        if(n == 0){
            c++;
            return;
        }
        count(n-1);
        count(n-2);
    }
    public static int climbStairs(int n) {
        count(n);
        return c;
    }

    static void main() {
        System.out.println(climbStairs(5));
    }
}
