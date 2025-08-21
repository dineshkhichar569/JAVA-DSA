package Java.Array;
import java.util.Arrays;

public class LC_1389_Create_Target_Array_in_the_Given_Order {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;

        int[] target = new int[n];

        for (int i = 0; i < n; i++) {
            if(nums[i] > index[i]){
                target[i] = nums[i];
            }else {
                target[i] = index[i];
            }
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] ans = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));
    }
}
