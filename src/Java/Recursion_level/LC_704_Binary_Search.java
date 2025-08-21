package Java.Recursion_level;

public class LC_704_Binary_Search {
    public static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        return binary_Search(arr, start, end, target);
    }
    private static int binary_Search(int[] arr, int start, int end, int target){
        if(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                return binary_Search(arr, start, mid - 1, target);
            } else if (arr[mid] < target) {
                return binary_Search(arr, mid + 1, end, target);
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(arr, target));
    }
}
