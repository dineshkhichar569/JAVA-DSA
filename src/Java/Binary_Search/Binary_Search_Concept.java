package Java.Binary_Search;

public class Binary_Search_Concept {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 13;

        int ans = BinarySearch(arr, target);

        System.out.println(ans);

    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            // find the middle element
//            int mid = (start + end)/2; // might be possible that (start = end) exceeds the range of integer in java.
            int mid = start + (end - start) / 2;
            
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                // ans found
                return mid;
            }
        }
        return -1; // if element does not exist //
    }

}
