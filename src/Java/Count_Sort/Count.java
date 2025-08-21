package Java.Count_Sort;

import java.util.Arrays;

public class Count {
    public static int[] countSort(int[] arr){
        int max = arr[0];
        for (int num : arr){
            if(num > max){
                max = num;
            }
        }
        int[] frequency = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i < max; i++) {
            while(frequency[i] > 0){
                arr[index] = i;
                index++;
                frequency[i]--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,1,3,2,5,2,8};

        String ans = Arrays.toString(countSort(arr));
        System.out.println(ans);
    }
}
