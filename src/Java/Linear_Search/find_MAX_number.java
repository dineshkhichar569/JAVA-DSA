package Java.Linear_Search;

public class find_MAX_number {
    public static void main(String[] args) {
        int[] arr = {1, 22, -30, 4, 56, 7, -3, 8, 10};

        System.out.println(findMAX(arr));
    }
    static int findMAX(int[] arr){
        if (arr.length == 0) {
            return -1;
        }
        
        int ans = arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
