package Java;

public class Q_02_Reverse_Number {
    public static void main(String[] args) {
        int x = 23597;

        ////  Method 1  ////
        while (x > 0) {
            int remainder = x % 10;
            System.out.print(remainder);

            x = x / 10;
        }

        System.out.println(" ");

            //// Method 2 ////
        int y = 23597;
            int ans = 0;
            while (y > 0) {
                int rem = y % 10;
                y /= 10;
                ans = ans * 10 + rem;
            }
            System.out.println(ans);

        }
    }