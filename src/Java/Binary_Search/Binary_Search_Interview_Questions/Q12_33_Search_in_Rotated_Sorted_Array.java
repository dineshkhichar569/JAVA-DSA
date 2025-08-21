package Java.Binary_Search.Binary_Search_Interview_Questions;

public class Q12_33_Search_in_Rotated_Sorted_Array {
    // 4,5,6,7,0,1,2
////////       Asked in GOOGLE and AMAZON   //////////////////////
///////        Asked in GOOGLE and AMAZON   //////////////////////
///////        Asked in GOOGLE and AMAZON   //////////////////////
///////        Asked in GOOGLE and AMAZON   //////////////////////

    // this will not work in duplicate elements array //
    static int peak(int[] arr){
//        int max = arr.length-1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > arr[max]){
//                max = i;
//            }
//        }
//        return max;

        /////////////////// OR OR OR OR OR /////////////////////
        /////////////////// OR OR OR OR OR /////////////////////
        /////////////////// OR OR OR OR OR /////////////////////

        // 4,5,6,7,0,1,2
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            // 4,5,6,7,0,1,2  7 IS MID
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            // 5,6,7,0,1,2,3   0 IS MID
            if(mid>start && arr[mid - 1] > arr[mid]){
                return mid-1;
            }

            if(arr[start] > arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int BinarSearch(int[] arr, int target, int start, int end){
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
    static int Result(int[] arr, int target){
        int peak = BinarSearch(arr, target, 0, peak(arr));
        if (peak != -1){
            return peak;
        }
        return BinarSearch(arr, target, peak(arr)+1 , arr.length-1);
    }


    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
//        int[] arr = {1, 3};
//        int[] arr = {3, 1, 2};
//        int[] arr = {5, 1, 3};
        int target = 0;

        int ans = Result(arr, target);
        System.out.println(ans);

//        System.out.println(search(arr, target));
    }
}
