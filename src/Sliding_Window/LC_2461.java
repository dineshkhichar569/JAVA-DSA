package Sliding_Window;

public class LC_2461 {
    public static long maximumSubarraySum(int[] arr, int k) {
        long sum = 0;

        int i = 0;
        int j = 0;

        long mx = 0;

        while(j < arr.length){
            if(j-i+1 < k){
                sum = sum + arr[j];
                j++;
            }else if(j-i+1 == k){
                sum = sum + arr[j];
                mx = Math.max(mx, sum);
                sum = sum - arr[i];

                i++;
                j++;
            }
        }

        return mx;
    }

    static void main() {
        int[] arr = {1,5,4,2,9,9,9};
        int k = 3;

        System.out.println(maximumSubarraySum(arr, k));
    }
}
