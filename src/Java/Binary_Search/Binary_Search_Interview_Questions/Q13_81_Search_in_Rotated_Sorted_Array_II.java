package Java.Binary_Search.Binary_Search_Interview_Questions;

public class Q13_81_Search_in_Rotated_Sorted_Array_II {
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            // checking at the decending part of an array which are two elements
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            // checking at the decending part of an array which are two elements
            if (mid > start && arr[mid - 1] > arr[mid]){
                return mid - 1;
            }
            // checking at the accending part of an array which are two elements
            /// if elements at middle, start, end are equal then just skip the duplicates
            if(start != end && arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates
                // Note : what if these elements at start and end were the pivots ??
                // so check whether start is pivot or not
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                // so check whether end is pivot or not
                if(arr[end - 1] > arr[end]){
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    static boolean Result(int[] arr, int target){
        int pivot = peak(arr);

        int peak = binarySearch(arr, target, 0, peak(arr));
        int leak = binarySearch(arr, target, peak(arr)+1 , arr.length-1);
        if (peak != -1){
            return true;
        }
        if (leak != -1){
            return true;
        }
        return false;
    }


/////////////////////////////////////  OR OR OR OR OR  ////////////////////////////////////////
/////////////////////////////////////  OR OR OR OR OR  ////////////////////////////////////////
/////////////////////////////////////  OR OR OR OR OR  ////////////////////////////////////////
/////////////////////////////////////  OR OR OR OR OR  ////////////////////////////////////////
/////////////////////////////////////  OR OR OR OR OR  ////////////////////////////////////////

    static boolean search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the mid element is the target
            if (arr[mid] == target) {
                return true;
            }

            // If we encounter duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }
            // Check if left half is sorted
            else if (arr[start] <= arr[mid]) {
                // Check if target is in the sorted left half
                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Right half must be sorted
            else {
                // Check if target is in the sorted right half
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        // Target not found
        return false;
    }

    public static void main(String[] args) {
//        int[] arr = {4,5,6,7,0,1,2};
//        int[] arr = {1,0,1,1,1};
        int[] arr = {1,1,1,1,1,1,1,1,1,13,1,1,1,1,1,1,1,1,1,1,1,1};
//        int[] arr = {1};
//        int[] arr = {5, 1, 3};
        int target = 13;

        boolean ans = search(arr, target);
        System.out.println(ans);
    }
}
