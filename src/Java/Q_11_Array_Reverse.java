package Java;

import java.util.Arrays;

public class Q_11_Array_Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};

        System.out.print(Arrays.toString(arr));

        System.out.println(" ");

        reverse(arr);
    }
    static void reverse(int[] array){
        int start = 0;
        int end = array.length-1;

        while (start < end){
            swap(array, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(array));
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
