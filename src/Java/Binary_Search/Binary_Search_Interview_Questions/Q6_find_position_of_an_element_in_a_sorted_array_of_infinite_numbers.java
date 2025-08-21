package Java.Binary_Search.Binary_Search_Interview_Questions;

///////////////////////////////////////////  I M P O T A N T  //////////////////////////////////////////
///////////////////////////////////////////  I M P O T A N T  //////////////////////////////////////////
///////////////////////////////////////////  I M P O T A N T  //////////////////////////////////////////
///////////////////////////////////////////  I M P O T A N T  //////////////////////////////////////////
///////////////////////////////////////////  I M P O T A N T  //////////////////////////////////////////

public class Q6_find_position_of_an_element_in_a_sorted_array_of_infinite_numbers {

    // using Linear Search
    public static int LinearSearch(int[] arr, int target){
        int index = 0;
        for (int i : arr){
            if(i == target){
                return index;
            }
            index++;
        }
        return -1;
    }

    // Using Binary Search because it is a sorted array
    // for this firstly we have to find start and end of an array to apply binary search
    // if target > arr[end] the double the size of an array whose initial size is 1
    static int findRange(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){

//            int temp = end + 1;
//            ////////// end = previous end + sizeofbox * 2  ///////////////
//            end = end + (end - start + 1) * 2;
//            start = temp;

            ////// or ///////
            start = 2*(start + 1);
            end = 2*(end + 1) + 1;

        }

        return BinarySearch(arr, target, start, end);
    }

    public static int BinarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 20, 23, 30};
        int target = 12;

//        int ans = LinearSearch(arr, target);
//        System.out.println(ans);

//        int start = 0;
//        int end = 1;
//        start = 2*(start+1);
//        end = 2*(end+1)+1;

        int ans2 = findRange(arr, target);
        System.out.println(ans2);
    }
}
