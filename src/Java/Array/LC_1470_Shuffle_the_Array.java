package Java.Array;

import java.util.Arrays;

public class LC_1470_Shuffle_the_Array {
    public static int[] shuffle(int[] arr, int n) {
        int s = 0;
        int e = arr.length;

        int[] even = new int[n];
        int[] odd = new int[e-n];

        int index = 0;
        for (int i = 0; i < e; i++) {
            if(i < n){
                even[i] = arr[i];
            }
            if(i >= n){
                odd[index] = arr[i];
                index++;
            }
        }
        int evenIndex = 0;
        int oddIndex = 0;
        while(s < e){
            if(s % 2 == 0){
                arr[s] = even[evenIndex];
                evenIndex++;
            }
            if(s % 2 == 1){
                arr[s] = odd[oddIndex];
                oddIndex++;
            }
            s++;
        }

        return arr;
    }

    public static int[] anotherMethod(int[] arr, int n){
        int c = 0;
        int[] ans = new int[2*n];
        for (int i = 0; i < 2*n; i+=2) {
            ans[i] = arr[c];
            ans[i+1] = arr[n + c];
            c++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;

//        int[] ans = shuffle(arr, n);
        int[] ans = anotherMethod(arr, n);
        System.out.println(Arrays.toString(ans));
    }

}
