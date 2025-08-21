package Java.Binary_Search.Binary_Search_Interview_Questions;

import java.util.Arrays;

public class Q18_4_Median_of_Two_Sorted_Arrays {
    // firstly arrange in sorted
    // if odd :-  M = (N/2)
    // if enen :- ((N/2)+(N/2+1))/2
    // N = total no. of elements.

    static float median(int[] num1, int[] num2){
        int[] merged = new int[num1.length + num2.length];

        // merging two arrays
        int i = 0;
        for (int num : num1){
            merged[i] = num;
            i++;
        }
        for (int num : num2){
            merged[i] = num;
            i++;
        }
        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));

        int start = 0;
        int end = merged.length-1;

        // for even
        if(merged.length % 2 == 0){
            int mid = start + (end - start)/2;

            float a = merged[mid];
            float b = merged[mid + 1];
            float even = (a + b) / 2;
//            System.out.println(even);
//            System.out.println(a + " , " + b);
            return even;
        }

        // for odd
        if(merged.length%2 != 0){
            int a = start + (end - start)/2;
            float odd = merged[a];
            return odd;
        }
        return 0.0f;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 3};
        int[] num2 = {2};

        float ans = median(num1, num2);
        System.out.println(ans);

//        int[] arr = {1, 2, 3, 4};
//        int start = 0;
//        int end = arr.length;
//        int mid = start + (end - start)/2;
//        System.out.println(mid);
//        System.out.println(arr.length/2);

    }
}
