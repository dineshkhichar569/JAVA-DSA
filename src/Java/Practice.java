package Java;

import Java.Binary_Search.Binary_Search_Concept;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
//        System.out.println(Convert(100));
//
//        System.out.println(Math.sin(Math.PI/2));
//
//        int a = (int) Math.ceil((int)'a' + Math.random() * (int)'z');
//        System.out.println(a);
//
//        char ch = (char)('\u0000' + Math.random() * ('\uFFFF' - '\u0000' + 1));
//        System.out.println(ch);

        int[] arr = {23, 45, 67, 78, 89, 90, 96, 645, 678};

        int[][] arrr = {
                {1, 4, 6, 2},
                {3, 1, 2, 6},
                {5, 2, 1, 4}
        };
        int sum = 0;
        for (int i = 0; i < arrr.length; i++) {
            for (int j = 0; j < arrr[i].length; j++) {
                System.out.print(arrr[i][j] + " ");
                sum = sum + arrr[i][j];
            }
            System.out.println("");
        }
        System.out.println(sum);


        int ans = binarySearch(arr, 96);
        System.out.println(ans);

        int ans2 = linearSearch(arr, 96);
        System.out.println(ans2);

        int[] copy = new int[arr.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = arr[i];
        }
        System.out.println(Arrays.toString(copy));

    }
    static int Convert(int a){
        int rem = a % 16;
        return rem;
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            if(target == arr[start]){
                return start;
            }
            start++;
        }
        return -1;
    }
}