package LeetCode;

public class LC_Remove_element {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
//        int[] nums = {3, 2, 2, 3};

        int val = 2;
        int remOut = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[remOut] = nums[i];
                remOut++;
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println();
        System.out.println(remOut);

    }
}
