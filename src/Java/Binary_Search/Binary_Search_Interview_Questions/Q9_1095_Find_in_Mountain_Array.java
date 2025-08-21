package Java.Binary_Search.Binary_Search_Interview_Questions;

public class Q9_1095_Find_in_Mountain_Array {

///////////////////////////////////////// M1 M1 M1 M1 M1 M1 ///////////////////////////////////////
///////////////////////////////////////// M1 M1 M1 M1 M1 M1 ///////////////////////////////////////
///////////////////////////////////////// M1 M1 M1 M1 M1 M1 ///////////////////////////////////////

//    this can also also give the same output as the below solution gives
    static int binary(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1]){
                end = mid - 1;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        int f1 = 0;
        int e1 = start;

        while (f1 <= e1){
            int m1 = f1 + (e1 - f1)/2;
            if (target < arr[m1]){
                e1 = m1 - 1;
            } else if (target > arr[m1]) {
                f1 = m1 + 1;
            }else {
                return m1;
            }
        }

        int f2 = start + 1;
        int e2 = arr.length-1;
        while (f2 <= e2){
            int m2 = f2 + (e2 - f2)/2;
            if (target < arr[m2]){
                e2 = m2 - 1;
            } else if (target > arr[m2]) {
                f2 = m2 + 1;
            }else {
                return m2;
            }
        }

        return -1;
    }


/////////////////////////////////////// M2 M2 M2 M2 M2 M2 ///////////////////////////////////////
/////////////////////////////////////// M2 M2 M2 M2 M2 M2 ///////////////////////////////////////
/////////////////////////////////////// M2 M2 M2 M2 M2 M2 ///////////////////////////////////////
// IN THIS WE NEED THREE METHODS
       //  This Methode to find the peak index
    static int PeakIndex(int[] arr){
        ///  {1, 2, 3, 4, 5, 3, 1}  ///
        ///   0  1  2  3  4  5  6
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int Result(int[] arr, int target){
        ///  here, PeakIndex(arr) + 1  in this  +1 is because PeakIndex(arr) index is already in end in peak
        /// if {start = PeakIndex(arr)} then make {end = PeakIndex(arr) - 1} vise-versa
        int peak = findInMountainArray(arr, target, 0, PeakIndex(arr));
        if(peak != -1){
            return peak;
        }

        return findInMountainArray(arr, target, PeakIndex(arr) + 1, arr.length-1);
    }

      // This methode is to find the target index value  Which takes start , end from Result Method
    static  int findInMountainArray(int[] arr , int target, int start, int end){
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
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 3, 1};
//        int[] arr = {1, 2, 5, 4, 3, 1};
//        int[] arr = {0, 1, 2, 4, 2, 1};
//        int[] arr = {1, 2, 3, 4, 5, 3, 1};
//        int[] arr = {1, 2, 4, 5, 6, 3, 1};

        int ans = Result(arr, 3);
        System.out.println(ans);
    }
}
