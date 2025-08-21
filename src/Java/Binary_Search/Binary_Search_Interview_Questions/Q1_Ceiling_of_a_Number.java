package Java.Binary_Search.Binary_Search_Interview_Questions;

public class Q1_Ceiling_of_a_Number {
    public static void main(String[] args) {
        // arr = [2, 3, 5, 9, 14, 16, 18]
        // target = 15
        // ceiling = smallest element in array greater or equal to target
        // ceiling(arr, target = 14) = 14
        // ceiling(arr, target = 15) = 16
        // ceiling(arr, target = 4) = 5
        // ceiling(arr, target = 9) = 9

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
//        int[] arr = {2, 1, 5, 19, 4, 13, 8};

//        System.out.println(mySol(arr, 7));
        System.out.println("Ceiling no. is : " + binarySol(arr, 11));

    }

    static int mySol(int[] arr, int target){
//        for (int i = 0; i < arr.length; i++) {
//            if(target <= arr[i]){
//                return arr[i];
//            }
//        }

        /////////  OR  /////////

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            if (arr[start] >= target){
                return arr[start];
            }
            start ++;
        }

        return -1;
    }

    static int binarySol(int[] arr, int target){

        if(target > arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]){
                end = mid - 1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[start];
    }

}
