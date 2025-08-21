package Java;

public class Q_10_Maximum_Array_value {
    public static void main(String[] args) {
        int[] arr = {12, 24, 3933, 46, 105, 475};
        Max(arr);
    }
    static void Max(int[] arr){
        int max = arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >  max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
