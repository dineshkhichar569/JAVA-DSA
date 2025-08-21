package Java.Cycle_Sort;

///////////////////////////////////////////////////////////////////////////////////////
////////////////////////////// Asked in Microsoft ///////////////////////////////////////
////////////////////////////// Asked in Microsoft ///////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////

public class LC_287_Find_the_Duplicate_Number {
    public static int duplicate(int[] arr){
        int s = 0;
        int e = arr.length;

        while (s < e){
            int correct = arr[s] - 1;

            if(arr[s] != arr[correct]){
                int temp = arr[s];
                arr[s] = arr[correct];
                arr[correct] = temp;
            }else {
                s++;
            }
        }
        for (int i = 0; i < e; i++) {
            if(arr[i] != i+1){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] arr = {1,3,4,2,2};
//        int[] arr = {3,1,3,4,2};
        int[] arr = {1, 2, 3};

        int ans = duplicate(arr);
        System.out.println(ans);
    }
}
