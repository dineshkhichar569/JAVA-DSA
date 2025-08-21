package Java.Linear_Search;

public class Search_in_Range {
    public static void main(String[] args) {
        // arr = [0, 1, 2, 3, 4, 5, 6]
        // Q. Search for 3 in the range of index[1, 4]

        int[] nums = {23, 4, 56, 6, 89, -7, -78, 35, 34, 12, 37};
        int target = 6;

        int ans2 = linearSearch2(nums, target, 1, 4);
        System.out.println(ans2);
    }

    static int linearSearch2(int[] arr, int target, int start, int end){
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for (int i = start; i <= end; i++) {
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

}
