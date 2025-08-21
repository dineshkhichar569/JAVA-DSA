package Java.Binary_Search.Binary_Search_Interview_Questions;

@SuppressWarnings("ALL")
public class Q5__35_Search_Insert_Position {

    static int searchInsert(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        if(target > nums[nums.length-1]){
            return nums.length;
        }
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int ans = searchInsert(nums, target);
        System.out.println(ans);
    }
}
