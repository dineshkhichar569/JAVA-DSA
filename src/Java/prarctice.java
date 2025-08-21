package Java;

import java.util.Arrays;
import java.util.Scanner;

public class prarctice {

    static boolean prime(int num){
        if(num <= 1){
            return false;
        }

        int i = 2;
        while(i <= Math.sqrt(num)){
            if (num%i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
    static void prims(int n){
        int count = 0;
        int num = 2;

        while(count <= n ){
            if (prime(num)){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }


    static void binary(int n){
        if(n == 0){
            System.out.println(0);
        }
        int[] rem = new int[8]; // assume 8bits
        int i = rem.length-1;
        while(n > 0){
            rem[i] = n % 2;
            n = n/2;
            i--;
        }
        System.out.println(Arrays.toString(rem));
    }
    static void usingRecursive(int n){

        // Base case: if n is 0, return
        if(n == 0){
            return;
        }

        // Recursive call to divide the number
        usingRecursive(n / 2);

        // Print the remainder after dividing by 2
        System.out.print(n % 2);
    }


    static void hexadecimal(int n){
        if(n == 0){
            System.out.println(0);
            return;
        }

        char[] arr = new char[8];
        int i = arr.length-1;

        while (n > 0){
            int rem = n % 16;

            if(rem < 10){
                arr[i] = (char)(rem + '0');

            }else{
                arr[i] = (char)(rem - 10 + 'A');
            }
            n = n / 16;
            i--;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
//        prims(50);
//        binary(20);
//        usingRecursive(10);
//        hexadecimal(454567);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the square: ");
            int size = scanner.nextInt();

            // Outer loop for rows
            for (int i = 1; i <= size; i++) {
                // Inner loop for columns
                for (int j = 1; j <= size; j++) {
                    // Print '*' for the border rows and columns
                    if (i == 1 || i == size || j == 1 || j == size) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  "); // Print space for hollow part
                    }
                }
                System.out.println(); // Move to the next line
            }

            scanner.close();

    }

}
