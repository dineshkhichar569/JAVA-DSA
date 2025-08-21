package Java.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LC_905_Sort_Array_By_Parity {
    public static int[] sortArrayByParity(int[] arr){
        int s = 0;
        int e = arr.length-1;

        int[] sortArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                sortArr[s] = arr[i];
                s++;
            }else {
                sortArr[e] = arr[i];
                e--;
            }
        }
        return sortArr;
    }

    public static void main(String[] args) {
//        int[] arr = {3, 1, 2, 4};
        int[] arr = {0};

        int[] ans = sortArrayByParity(arr);
        System.out.println(Arrays.toString(ans));
    }
}
