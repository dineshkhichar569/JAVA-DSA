package Java.Bubble_Sort;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){

        boolean swapped;

        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            // for each step, max item will come at the last respective index

            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previouse item
                if(arr[j] < arr[j-1]){
//                     swap
                    int swap = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = swap;

                    swapped = true;
                }
            }
        // if you did not swap for a particular value of i,
            // it means the array is sorted hence stop the program

            if(!swapped){ // or ( swapped == false )
                // !swapped means false
                break;
            }
        }

    }
}
