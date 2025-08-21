package Java.Selection_Sort;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        int[] arr = {4, 5, 1, 3, 2, 0, -9, 7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            int last = arr.length-i-1;
            for (int j = 0; j < last; j++) {
                if(arr[j] > arr[last]){
                    int temp = arr[j];
                    arr[j] = arr[last];
                    arr[last] = temp;
                }

            }
        }
    }

}
