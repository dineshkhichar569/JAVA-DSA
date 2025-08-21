package Java.Binary_Search.Binary_Search_Interview_Questions;

import java.util.Arrays;

public class Q15_154_Find_Minimum_in_Rotated_Sorted_Array_II {
//    static int minimum(int[] arr){
//        int start = 0;
//        int end = arr.length-1;
//
//        if(start == end){
//            return arr[start];
//        }
////        if(arr.length == 2 && arr[start] == arr[end]){
////            return arr[start];
////        }
//
//        while (start <= end){
//            int mid = start +(end - start);
//
//            if(mid < end && arr[mid] > arr[mid + 1]){
//                return arr[mid + 1];
//            }
//            if(mid > start && arr[mid - 1] > arr[mid]){
//                return arr[mid];
//            }
//
//            if(arr[start] == arr[mid] && arr[end] == arr[mid]){
//                start++;
//                end--;
//            } else if (arr[start] <= arr[mid]) {
//                if(arr[start] <= arr[start + 1]){
//                    return arr[start];
//                }
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//        return -1;
//    }

    static int minimum(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check if mid is greater than the element after it
            if (arr[mid] > arr[end]) {
                start = mid + 1;  // Minimum must be in the right half
            } else if (arr[mid] < arr[end]) {
                end = mid;  // Minimum is in the left half including mid
            } else {
                // When arr[mid] == arr[end], reduce the search space
                end--;
            }
        }

        // start will point to the minimum element
        return arr[start];
    }


    public static void main(String[] args) {
//        int[] arr = {2,2,2,0,1};
//        int[] arr = {1,3,5};
//        int[] arr = {3,4,5,1,2};
//        int[] arr = {1};
//        int[] arr = {1,1};
        int[] arr = {1,1,3};
//        int[] arr = {1,1,1};


        int ans =  minimum(arr);
        System.out.println(ans);
    }
}