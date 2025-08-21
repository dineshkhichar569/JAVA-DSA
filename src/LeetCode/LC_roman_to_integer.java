package LeetCode;

import java.util.Scanner;

public class LC_roman_to_integer {
    public static void main(String[] args) {
        String[] s = {"I", "V", "X", "L", "C", "D", "M"};

//        int I = 1;
//        int V = 5;
//        int X = 10;
//        int L = 50;
//        int C = 100;
//        int D = 500;
//        int M = 1000;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        String ans = " ";
        for (int i = 0; i <= 1000; i++) {
            if(num == 1 && i == 1){
                ans = ans + "I";
            }
        }

        System.out.println(ans);

    }
}