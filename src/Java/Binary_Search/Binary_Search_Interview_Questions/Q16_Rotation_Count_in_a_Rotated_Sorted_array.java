package Java.Binary_Search.Binary_Search_Interview_Questions;

public class Q16_Rotation_Count_in_a_Rotated_Sorted_array {
    static int rotated(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[end]){
                start = mid + 1;
            } else if (arr[mid] < arr[end]) {
                end = mid;
            } else {
                end--;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
//        int[] arr = {7, 9, 11, 12, 5};
//        int[] arr = {7, 9, 11, 12, 15};

        int ans = rotated(arr);
        System.out.println("Rotated " + ans + " Times.");
    }
}
