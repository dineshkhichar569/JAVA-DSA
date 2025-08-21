package Java.Binary_Search.Binary_Search_Interview_Questions;

public class Q2_Floor_of_a_Number {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println("Floor of a number : " + binaryFloor(arr, 11));
    }

    static int binaryFloor(int[] arr, int target){

        if(target < arr[0]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        boolean isAcsending = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(isAcsending){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }

            if (target == arr[mid]) {
                return arr[mid];
            }

        }

        return arr[end];
    }

}
