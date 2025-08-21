package Java.Binary_Search.Binary_Search_Interview_Questions;

import java.util.Arrays;

public class Q4__34_Find_First_and_Last_Position_of_Element_in_Sorted_Array {

    static int[] searchRange(int[] nums, int target){

        int[] ans = {-1, -1};

//        int start = search(nums, target, true);
//        int end = search(nums, target, false);
//        ans[0] = start;
//        ans[1] = end;

        ///////////////// or or or //////////////////

        ans[0] = search(nums, target, true);

        if(ans[0] != -1)
            ans[1] = search(nums, target, false);

        return ans;
    }

    static int search(int[] nums, int target, boolean findFirstIndex){
        int start = 0;
        int end = nums.length-1;

        int ans = -1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                // potential ans found //
                ans = mid;
                if(findFirstIndex){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
//        int[] nums = {};
        int target = 7;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));

    }
}
