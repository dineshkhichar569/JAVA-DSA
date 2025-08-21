package Java.Bubble_Sort;

import java.util.Arrays;

public class bubble {
    public static int[] bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;

                    swapped = true;
                }
                if(swapped == false){
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
