package Java.Binary_Search.Binary_Search_Interview_Questions;

public class Q11_162_Find_Peak_Element {
    static int peakElement(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while (start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[mid + 1]){
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
//        int[] nums = {1};
        int ans = peakElement(nums);
        System.out.println(ans);
    }
}
