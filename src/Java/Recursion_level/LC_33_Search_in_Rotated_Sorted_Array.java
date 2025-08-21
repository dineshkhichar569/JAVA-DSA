package Java.Recursion_level;

public class LC_33_Search_in_Rotated_Sorted_Array {
//    public static int maximum(int[] arr){
//        int max = arr.length-1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > arr[max]){
//                max = i;
//            }
//        }
//        return max;
//    }
//    public static int rotated(int[] arr, int start, int end, int target){
//        while (start <= end){
//            int mid = start + (end - start)/2;
//            if(arr[mid] == target){
//                return mid;
//            } else if (arr[mid] < target) {
//                start = mid + 1;
//            }else {
//                end = mid - 1;
//            }
//        }
//        return -1;
//    }
//    public static int search(int[] arr, int target){
//        int peak = rotated(arr, 0, maximum(arr), target);
//        if(peak != -1){
//            return peak;
//        }
//        return rotated(arr, maximum(arr)+1, arr.length-1, target);
//    }

    public static int search(int[] arr, int target) {
        return rotatedSearch(arr, target, 0, arr.length - 1);
    }
    private static int rotatedSearch(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }

        if(arr[start] <= arr[mid]){
            if(arr[start] <= target && arr[mid] >= target){
                return rotatedSearch(arr, target, start, mid-1);
            }else {
                return rotatedSearch(arr, target, mid+1, end);
            }
        }

        if(arr[end] >= target && arr[mid] <= target){
            return rotatedSearch(arr, target, mid+1, end);
        }else {
            return rotatedSearch(arr, target, start, mid-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,1,3};
        System.out.println(search(arr, 3));
    }
}
