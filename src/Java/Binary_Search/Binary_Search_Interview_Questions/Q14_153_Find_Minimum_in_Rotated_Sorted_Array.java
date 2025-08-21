package Java.Binary_Search.Binary_Search_Interview_Questions;

public class Q14_153_Find_Minimum_in_Rotated_Sorted_Array {

    //////  using binaery search  //////
    static int minimum(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return arr[mid + 1];
            }
            if(mid > start && arr[mid-1] > arr[mid]){
                return arr[mid];
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[0];
    }

    /////////////////////  OR OR OR OR OR OR OR OR OR  ///////////////////////

    /////// without using binary search ////////
    static int next(int[] arr){
        int start = 0;
        int end = arr.length-1;

        int max = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        int ans = 0;
        if(arr[max] == arr[end]){
            ans = arr[start];
        } else {
            ans = arr[max + 1];
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] arr = {3,4,5,1,2};
//        int[] arr = {4,5,6,7,0,1,2};
//        int[] arr = {11,13,15,17};
//        int[] arr = {2,3,4,5,1};
        int[] arr = {3,1,2};
        int ans = minimum(arr);
        System.out.println(ans);

    }
}