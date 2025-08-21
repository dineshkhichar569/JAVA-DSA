package Java.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LC_1636_Sort_Array_by_Increasing_Frequency {
    public static int[] frequencySort(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int x = 0;
        int[] freq = new int[arr.length];
        int[][] freq2d = new int[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
//            boolean isDuplicate = false;
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue; // Skip duplicates
            }
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (i > 0 && arr[i] == arr[i - 1]) {
                    // Skip duplicates
                    continue;
                } else if(arr[i] == arr[j]) {
                    count++;
                }
            }

            freq[x] = count;
            freq2d[x][0] = arr[i];
            freq2d[x][1] = count;
            x++;
        }
        System.out.println(Arrays.deepToString(Arrays.copyOf(freq2d, x)));



        return Arrays.copyOf(freq, x);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,3,2};  // 3,1,1,2,2,2
//        int[] arr = {-1,1,-6,4,5,-6,1,4,1};
        System.out.println(Arrays.toString(frequencySort(arr)));
    }
}
