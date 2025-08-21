package Java.Cycle_Sort;

public class LC_41_First_Missing_Positive {

    // it is cyclic sort but it is hard question beacuase it is not specified that it is a cyclic sort directly


    ///////////////////////////////////////// Asked in Amazon  /////////////////////////////////////////////////////
    ///////////////////////////////////////// Asked in Amazon  /////////////////////////////////////////////////////
    ///////////////////////////////////////// Asked in Amazon  /////////////////////////////////////////////////////

    public static int firstMissingPositive(int[] arr) {
        int s = 0;
        int e = arr.length;

        while (s < e){
            int correct = arr[s]-1;

            if(arr[s] > 0 && arr[s] < e && arr[s] != arr[correct]){
                int temp = arr[s];
                arr[s] = arr[correct];
                arr[correct] = temp;
            }else {
                s++;
            }
        }

        for (int i = 0; i < e; i++) {
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return e+1;
    }

    public static int missingFirstPositive(int[] arr){
        int s = 0;
        int e = arr.length;

        // first +ve number so ignore the 0 or less then 0 numbers
        // to ignnore 0 => arr[s] > 0
        while (s < e){
            int correct = arr[s]-1;

            if (arr[s] < e && arr[s] > 0 && arr[s] != arr[correct]){
                int temp = arr[s];
                arr[s] = arr[correct];
                arr[correct] = temp;
            } else {
                s++;
            }
        }
        for (int i = 0; i < e; i++) {
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return e+1;
    }

    public static void main(String[] args) {
//        int[] arr = {3,4,-1,1};
//        int[] arr = {1};
//        int[] arr = {1,2,0};
        int[] arr = {7,8,9,11,12};
        int ans = missingFirstPositive(arr);
        System.out.println(ans);
    }
}