package College_Brain_Mentors.Recursion;

public class factorial {
    public static int fact(int n){
        System.out.println(n);

        if(n == 1){
            return n;
        }


        return n * fact(n-1);
    }

    static void main() {
        System.out.println(fact(5));
    }
}
