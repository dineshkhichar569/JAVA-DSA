package Java.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_15_3Sum {

    public static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> matrix = new ArrayList();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            int k = arr.length - 1;

            if (i == 0 || arr[i - 1] != arr[i]) {
                while (j < k) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == 0) {
                        matrix.add(Arrays.asList(arr[i], arr[j], arr[k]));

                        while (j < k && arr[j] == arr[j + 1]) j++;
                        while (j < k && arr[k] == arr[k - 1]) k--;

                        j++;
                        k--;
                    } else if (sum > 0) {
                        // sum > 0 so make k--
                        k--;
                    } else {
                        j++;
                    }
                }
            }
        }
        return matrix;
    }


    public static List<List<Integer>> Sum(int[] arr){
        List<List<Integer>> list = new ArrayList();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            int k = arr.length-1;

            if (i == 0 || arr[i-1] != arr[i]) {
                while(j < k){
                    int total = arr[i] + arr[j] + arr[k];
                    if(total > 0){
                        k--;
                    } else if (total < 0) {
                        j++;
                    }else {
                        list.add(Arrays.asList(arr[i], arr[j], arr[k]));

                        while(j < k && arr[j] == arr[j+1])j++;
                        while(j < k && arr[k] == arr[k-1])k--;

                       j++;
                       k--;
                    }
                }
            }
        }
        return list;
    }



    public static void main(String[] args) {
//        int[] arr = {-2,0,0,2,2};
//        int[] arr = {0,0,0,0};
        int[] arr = {-1,0,1,2,-1,-4};
//        int[] arr = {0,1,1};

        System.out.println(Sum(arr));
    }
}
