package Java.Binary_Search.Binary_Search_Interview_Questions;

import OOPS.Sunny.Main;

import java.util.Arrays;

public class Q10_1539_Kth_Missing_Positive_Number {

    // M1 = Make a new array expect the elements which are present in arr array
    // and the apply binary search
    static  int missing(int[] arr, int k){
        int[] newArr = new int[arr[arr.length-1] * 2];



        Arrays.sort(newArr);
        System.out.println(Arrays.toString(newArr));
        return newArr.length;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;

        int ans = missing(arr, k);
        System.out.println(ans);
    }
}
