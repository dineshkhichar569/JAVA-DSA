package LeetCode;

public class LeetCode01 {
    public static void main(String[] args) {
        int []nums = {2, 7, 11, 15};
        int target = 9;

        for(int i = 0; i < 3; i++){
            if(nums[i] + nums[i+1] == target){
                int a = i;
                int b = i+1;
                System.out.println("[" + a + "," + b + "]");
            }
        }

    }
}
