package Java.Sorting;

import java.util.Arrays;

public class LC_75_Sort_Colors {

    //  Time complexity is  = N^2
    public static void sortColors(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                // swap if the item is smaller than the previouse item
                if(arr[j] < arr[i]){
                    int swap = arr[j];
                    arr[j] = arr[i];
                    arr[i] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void colorSort(int[] arr){
        int i = 0;
        int j = 1;
        int k = arr.length;

        while (i < k){
            while(j < k){
                if(arr[j] < arr[j-1]){
                    int swap = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = swap;
                }
                j++;
            }
            i++;
        }


        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};

        sortColors(arr);

//        colorSort(arr);
    }
}
