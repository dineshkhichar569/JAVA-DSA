package College_Brain_Mentors.Recursion;

public class SumOfN {
    public static int sum(int n){
        
        if(n == 0){
            return n;
        }

        return n + sum(n-1);
    }
    public static void sumVoid(int n, int ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }

        sumVoid(n-1, n + ans);
    }

    static void main() {
        System.out.println(sum(10));

        sumVoid(10, 0);
    }
}
