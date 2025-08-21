package Java.Binary_Search;

import javax.xml.stream.events.StartDocument;

public class Order_Agnostic_Binary_Search {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 6, 7, 8, 31, 67, 88};
        int[] arr2 = {88, 67, 31, 8, 7, 6, 4, 3, 1};

        System.out.println("Acsending order = " + binary(arr1, 8));
        System.out.println("Decsending order = " + binary(arr2, 8));

    }

    static int binary(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean Ace = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if (Ace){
                if (target > arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else{
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }

            if(arr[mid] == target){
                return mid;
            }

        }

        return -1;
    }
}
