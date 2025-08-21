package Java.Insertion_Sort;

import java.util.Arrays;

public class insertion {
    public static int[] insertionSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i <= n-2; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j-1] > arr[j]){
                    int swap = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = swap;
                }else {
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};

        int[] ans = insertionSort(arr);

        System.out.println(Arrays.toString(ans));
    }
}
