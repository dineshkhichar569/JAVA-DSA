package Java.Linear_Search;

public class main {
    public static void main(String[] args) {
        int[] nums = {23, 4, 56, 678, 89, -7, -78, 35, 34, 12, 37};
        int target = 12;

        boolean ans0 = linearSearch0(nums, target);
        System.out.println("Is element present in the array : " + ans0);

        int ans1 = linearSearch1(nums, target);
        System.out.println("if -1 is output then the element is not found or array is empty.");
        System.out.println("Your expected search element is at index : " + ans1);

        int ans2 = linearSearch2(nums, target);
        System.out.println("Your expected search element is : " + ans2);
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1

    static boolean linearSearch0(int[] arr, int target){
        if (arr.length == 0) {
            return false;
        }

        //run a for loop
        for (int element: arr) {
            // check for element at every index if it is = target
            if (element == target) {
                return true;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }

    static int linearSearch1(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if it is = target
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }

    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for (int element: arr) {
            // check for element at every index if it is = target
            if (element == target) {
                return element;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }

}
