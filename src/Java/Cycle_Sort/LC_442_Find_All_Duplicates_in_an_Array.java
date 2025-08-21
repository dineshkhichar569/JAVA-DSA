package Java.Cycle_Sort;

///////////////////////////////////////////////////////////////////////////////////////
////////////////////////////// Asked in Microsoft and Amazon ///////////////////////////////////////
////////////////////////////// Asked in Microsoft and Amazon ///////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////

import java.util.ArrayList;
import java.util.List;

public class LC_442_Find_All_Duplicates_in_an_Array {
    public static List<Integer> findDuplicates(int[] nums) {
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

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            if(nums[i] != i+1){
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer> ans = findDuplicates(nums);
        System.out.println(ans);

    }
}
