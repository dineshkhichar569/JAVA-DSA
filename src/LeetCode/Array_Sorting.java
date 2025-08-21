package LeetCode;

import java.util.Arrays;

public class Array_Sorting {
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,3};

        int big = arr[arr.length-1];

        int[] sort = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int index = 0;
            if(arr[i] < big){
                index = arr[i];
            }
            sort[i] = index;
        }
        System.out.println(Arrays.toString(sort));

    }
}
