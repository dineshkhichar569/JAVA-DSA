package LeetCode;

public class LC_Number_with_even_number_digits {
    public static void main(String[] args) {
//        int[] nums = {12, 345, 2, 6, 7896};
        int[] nums = {555, 901, 482, 1771, 1001};

        int n = nums.length;

        int count = 0;

        for (int arr : nums){
            String str = String.valueOf(arr);
            int ev = str.length();
            if(ev % 2 ==0){
                count++;
            }
        }
        System.out.println(count);

        int a = 5;

        String s = String.valueOf(a);

    }
}
