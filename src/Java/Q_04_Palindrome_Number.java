package Java;

import java.util.Scanner;

public class Q_04_Palindrome_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();

        palindrome(x);
    }

    static void palindrome(int n){
        int original = n;
        int reverse = 0;
        while(n > 0){
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n/10;
        }
        if(reverse == original){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not.");
        }
    }

}
