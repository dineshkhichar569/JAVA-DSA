package Java.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LC_414_Third_Maximum_Number {
    public static int thirdMax(int[] arr) {
        int[] target = new int[arr.length];
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max = 0;
            for (int j = 0; j <= last; j++) {
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            int swap = arr[max];
            arr[max] = arr[last];
            arr[last] = swap;

            target[ans] = arr[max];
            ans++;
        }
        System.out.println(Arrays.toString(target));
        System.out.println(Arrays.toString(arr));
        if(arr[2] != 0){
            return arr[2];
        }else {
            return arr[arr.length-1];
        }
    }

    public static void main(String[] args) {
//        int[] arr = {3,2,1};
        int[] arr = {2,2,3,1};

//        int[] ans = thirdMax(arr);
//        System.out.println(Arrays.toString(ans));

        System.out.println(thirdMax(arr));
    }
}
