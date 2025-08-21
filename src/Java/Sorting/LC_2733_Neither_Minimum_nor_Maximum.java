package Java.Sorting;

public class LC_2733_Neither_Minimum_nor_Maximum {
    public static int findNonMinOrMax(int[] nums) {
        int max = 0;
        int min = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[max]){
                max = i;
            }
            if(nums[i] < nums[min]){
                min = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[min] != nums[i] && nums[max] != nums[i]){
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,2};
        System.out.println(findNonMinOrMax(arr));
    }
}
