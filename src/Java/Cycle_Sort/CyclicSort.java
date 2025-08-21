package Java.Cycle_Sort;

import java.util.Arrays;

public class CyclicSort {

    /////// time comlexity is high for this code ///////
    public static int[] sort(int[] arr){
        int s = 0;
        int e = arr.length-1;

        while (s <= e){
            while (s != (arr[s]-1)){
                int temp = arr[arr[s]-1];
                arr[arr[s]-1] = arr[s];
                arr[s] = temp;
            }
            s++;
        }
        return arr;
    }

    /////// time comlexity of this is low ///////
    public static int[] sorted(int[] arr){
        int s = 0;
        int e = arr.length;
        while (s < e){

            int correct = arr[s] - 1;
            if(arr[s] != arr[correct]){
                 int temp = arr[s];
                 arr[s] = arr[correct];
                 arr[correct] = temp;
            }
            else {
                s++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {6,4,2,3,5,7,1};

        int[] ans = sorted(arr);
        System.out.println(Arrays.toString(ans));

    }
}
