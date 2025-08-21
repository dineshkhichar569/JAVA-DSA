package Java.Binary_Search.Binary_Search_Interview_Questions;

public class Q7_852_Peak_Index_in_a_Mountain_Array {

    ////// normal solution ( worst solution with 2ms runtime )
    static int peak(int[] arr){
        int max = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    ////////  using binary search ( best solution )  ////////
    static int peakIndex(int[] arr){
//        {1, 3, 5, 6, 4, 3, 2}
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                // you are in decreasing part of an array
                // this may be answer but look at left
                end = mid - 1;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        // this will return when start > end
        // when start > end that will be our answer
        return start;
    }

    public static void main(String[] args) {
//        int[] arr = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
//        int[] arr = {1, 3, 5, 6, 4, 3, 2, 0, -1};
        int[] arr = {1,2,1,3,5,6,4};
        int ans = peakIndex(arr);
        System.out.println(ans);
    }
}
