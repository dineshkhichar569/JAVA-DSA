package Java.Merge_Sort;

import java.util.Arrays;

public class MergeSort_In_Place_Method {

    public static void divide(int[] arr, int s, int e){
        if(s >= e){
            return;
        }
        int m = s + (e - s)/2;
        divide(arr, s, m);
        divide(arr, m+1, e);
        conquer(arr, s, m, e);
    }

    public static void conquer(int[] arr, int s, int m, int e){
        int[] mix = new int[e-s+1];
        int i = s;
        int j = m+1;
        int k = 0;
        while (i <= m && j <= e){
            if(arr[i] <= arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // if any one of the array is not completed
        while (i <= m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j <= e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int x = 0, y = s; x < mix.length; x++, y++) {
            arr[y] = mix[x];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,5,12,10,9,1};
        divide(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

}
