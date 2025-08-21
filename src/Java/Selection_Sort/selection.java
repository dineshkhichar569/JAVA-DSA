package Java.Selection_Sort;

import java.util.Arrays;

public class selection {
    public static int[] select(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length-i-1;
            int max = 0;
            for (int j = 0; j <= last; j++) {
                if(arr[j] > arr[max]){
                    max = j;
                }
            }

            int swap = arr[max];
            arr[max] = arr[last];
            arr[last] = swap;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }
}
