package Java.Array;

import java.util.Arrays;

public class LC_189_Rotate_Array {
    public static void rotate(int[] arr, int k) {
        int n = arr.length-1;

        reverseArr(arr, 0, n);
        reverseArr(arr, 0, k-1);
        reverseArr(arr, k, n);
    }

    public static void reverseArr(int[] arr, int left, int right) {
        while( left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(arr));

        rotate(arr, k);
    }
}
