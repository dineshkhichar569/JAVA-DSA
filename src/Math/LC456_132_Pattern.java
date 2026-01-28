package Math;

public class LC456_132_Pattern {
    public static boolean find132pattern(int[] arr) {
        int s = 0;
        int e = arr.length-1;


        for (int i = 0; i < arr.length; i++) {
            int m = s + (e - s)/2;

            if(m-1 >= 0 && m+1 <=arr.length-1 && (arr[m-1] < arr[m] && arr[m+1] < arr[m])){
                return true;
            } else if(m-1 >= 0 && arr[m-1] > arr[m]){
                s = m;
            } else {
                   e = m;
            }
        }
        return false;
    }
    static void main() {
        int[] arr = {3,5,0,3,4};
        System.out.println(find132pattern(arr));
    }
}
