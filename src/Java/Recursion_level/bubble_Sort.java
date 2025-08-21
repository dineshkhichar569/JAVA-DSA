package Java.Recursion_level;

import java.util.Arrays;

public class bubble_Sort {
    public static void bubble(int[] arr, int r, int c){
        if(r == 0){
            return;
        }

        if(c < r){
            if(arr[c] > arr[r]){
                int temp = arr[c];
                arr[c] = arr[r];
                arr[r] = temp;
            }
            bubble(arr, r, c+1);
        }else {
            bubble(arr, r-1, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,2,1,8,0};
        System.out.println(Arrays.toString(arr));

        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
}
