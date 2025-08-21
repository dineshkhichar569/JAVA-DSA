package Java.Linear_Search;

public class find_MIN_number {
    public static void main(String[] args) {
        int[] arr = {1, 22, -30, 4, 56, 7, -3, 8, 10};

        System.out.println(findMIN(arr));
    }
    static int findMIN(int[] arr){
        if (arr.length == 0) {
            return -1;
        }

        int num = arr[0];  // assume first element is minimum
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < num){
                num = arr[i];
            }
        }
        return num;
    }
}