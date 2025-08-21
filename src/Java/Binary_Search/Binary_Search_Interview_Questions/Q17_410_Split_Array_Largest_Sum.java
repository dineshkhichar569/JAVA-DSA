package Java.Binary_Search.Binary_Search_Interview_Questions;

//////////////////////////////  Asked in GOOGLE  /////////////////////////////////
//////////////////////////////  Asked in GOOGLE  /////////////////////////////////
//////////////////////////////  Asked in GOOGLE  /////////////////////////////////
//////////////////////////////  Asked in GOOGLE  /////////////////////////////////
//////////////////////////////  Asked in GOOGLE  /////////////////////////////////

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q17_410_Split_Array_Largest_Sum {

    static int solution(int[] arr, int k){
        int max = 0;
        int sum = 0;

        for (int num : arr) {
            max = Math.max(max, num);  // largest single element in the array
            sum += num;  // total sum of an array
        }

        // Binary search between start and end
        int start = max;
        int end = sum;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check if we can split the array into k or fewer subarrays with this mid as start end
            int currentSum = 0 ;
            int splits = 1;
            for (int num : arr) {
                if (currentSum + num > mid) {
                    splits++;       // Start a new subarray
                    currentSum = num; // Reset current end to the current number
                } else {
                    currentSum += num;
                }
            }

            if (splits > k) {
                start = mid + 1; // If more than k subarrays, increase start end
            } else {
                end = mid; // Otherwise, try a smaller start end
            }
        }

        return start; // Final minimized largest end
    }

    public static void main(String[] args) {
//        int[] arr = {7,2,5,10,8};
//        int[] arr = {1,2,3,4,5};
        int[] arr = {1,4,4};
        int k = 3;

        int ans = solution(arr, k);
        System.out.println(ans);

    }
}
