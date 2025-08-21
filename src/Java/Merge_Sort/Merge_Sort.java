package Java.Merge_Sort;

import java.util.Arrays;

public class Merge_Sort{
    public static int[] merge_Sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = merge_Sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge_Sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right){
        int[] mix = new int[left.length+ right.length];

        int i = 0;  // for left
        int j = 0;  // for right
        int k = 0;  // for mix
        while (i < left.length && j < right.length){
            if(left[i] > right[j]){
                mix[k] = right[j];
                j++;
            }
            else {
                mix[k] = left[i];
                i++;
            }
            k++;
        }

        // if any one of the array is not completed
        // copy the remaining element
        while (i < left.length){
            mix[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length){
            mix[k] = right[j];
            k++;
            j++;
        }
        return mix;
    }

    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        int[] ans = merge_Sort(arr);
        System.out.println(Arrays.toString(ans));
    }
}
