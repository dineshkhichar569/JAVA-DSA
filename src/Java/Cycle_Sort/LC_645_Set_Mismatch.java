package Java.Cycle_Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LC_645_Set_Mismatch {
    public static int[] findErrorNums(int[] nums) {
        int s = 0;
        int e = nums.length;

        while (s < e){
            int correct = nums[s]-1;

            if(nums[s] != nums[correct]){
                int temp = nums[s];
                nums[s] = nums[correct];
                nums[correct] = temp;
            } else {
                s++;
            }
        }

        int[] ans  = new int[2];
        int j = 0;
        for (int i = 0; i < e; i++) {
            // number got repeated
            if (nums[i] != i+1){
                ans[j] = nums[i];
                j++;
            }
            // number got missing
            if(nums[i] != i+1){
                ans[j] = i+1;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }
}
