package Java;

public class Recursion {

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }

    static int fibonacci(int x){
        int a = 0;
        int b = 1;

        while(b <= x){
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
        return -1;
    }

    static int fiboRecursion(int x){
        if(x<=1){
            return x;
        }
        return fiboRecursion(x-1) + fiboRecursion(x-2);
    }

    static void pascal(int n){
        int number = 1;
        int space = n;
        for (int i = 0; i < n; i++) {
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + "  ");
                number = number * (i - j)/(j+1);
            }
            System.out.println();
            space--;
        }
    }
    static void start(int n){
        int space = n;
        for (int i = 0; i < n; i++) {
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
            space--;
        }
    }


    public static void main(String[] args) {
//        int ans = factorial(5);
//        System.out.println(ans);

//        System.out.print(fibonacci(10));

//        for (int i = 0; i < 10; i++) {
//            System.out.print(fiboRecursion(i) + " ");
//        }

//        pascal(4);

        start(4);

    }

}
