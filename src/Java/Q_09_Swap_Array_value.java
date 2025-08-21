package Java;

import java.util.Arrays;

public class Q_09_Swap_Array_value {
    public static void main(String[] args) {
        int[] array = {2, 5, 3, 6, 8};

//        for (int initialArray : array){
//            System.out.print(initialArray + "  ");
//        }
        System.out.print(Arrays.toString(array) + "  ");

        System.out.println(" ");

        swap(array, 0, 1);
    }

    static void swap(int[] arr, int I1, int I2){
        int temp = arr[I1];
        arr[I1] = arr[I2];
        arr[I2] = temp;

//        for (int swapArr : arr){
//            System.out.print(swapArr + "  ");
//        }
        System.out.print(Arrays.toString(arr) + "  ");
    }

}
