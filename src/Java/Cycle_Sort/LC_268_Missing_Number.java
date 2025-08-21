package Java.Cycle_Sort;

////////////////////////////////////  Asked in Amazon /////////////////////////////////////////

public class LC_268_Missing_Number {
    public static int missing(int[] arr){
        int s = 0;
        int e = arr.length;

        while (s < e){
            int correct = arr[s];

            if(correct < e && arr[s] != arr[correct]){
                // swap
                int temp = arr[s];
                arr[s] = arr[correct];
                arr[correct] = temp;
            }else {
                s++;
            }
        }

//        Search the missing
        for (int i = 0; i < e; i++) {
            if(arr[i] != i){
                return i;
            }
        }
        return e;
    }

    public static void main(String[] args) {
//        int[] arr = {6,4,3,5,7,2,1};
        int[] arr = {6,4,3,5,7,0,1};
//        int[] arr = {2,4,1};

        int ans = missing(arr);
        System.out.println(ans);
    }
}
