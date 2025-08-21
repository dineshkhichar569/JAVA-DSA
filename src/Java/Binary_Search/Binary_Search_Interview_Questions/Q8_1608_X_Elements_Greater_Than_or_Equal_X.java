package Java.Binary_Search.Binary_Search_Interview_Questions;

import java.util.Arrays;

public class Q8_1608_X_Elements_Greater_Than_or_Equal_X {
    static int greater(int[] nums){
        // for the size of newArr
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                count++;
            }
        }

        int[] newArr = new int[count];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                newArr[index] = nums[i];
                index++;
            }
        }
        int ans = 0;
        for (int i = 0; i < newArr.length; i++) {
            if(newArr[i] >= count){
                ans++;
            }
        }
        if (ans == 0){
            return -1;
        }
        return ans;
    }

    static int newGreater(int[] nums){
        // to sort the array for using the binary search
        //   [3, 3, 6, 6, 7, 8, 8, 9]
        Arrays.sort(nums);


        return -1;
    }

    public static void main(String[] args) {
//        int[] nums = {0, 4, 3, 0, 4};
//        int[] nums = {0, 0};
//        int[] nums = {3, 6, 67, 7, 0};
        int[] nums = {3,9,7,8,3,8,6,6};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
