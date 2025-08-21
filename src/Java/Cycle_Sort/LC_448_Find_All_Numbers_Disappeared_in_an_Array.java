package Java.Cycle_Sort;

///////////////////////////////////////////////////////////////////////////////////////
////////////////////////////// Asked in Google ///////////////////////////////////////
////////////////////////////// Asked in Google ///////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////

import java.util.ArrayList;

import java.util.List;

public class LC_448_Find_All_Numbers_Disappeared_in_an_Array {
public static List<Integer> allMissing(int[] arr){
    int s = 0;

    while (s < arr.length){
        int correct = arr[s]-1;

        if(arr[s] != arr[correct]){
            int temp = arr[s];
            arr[s] = arr[correct];
            arr[correct] = temp;
        }else {
            s++;
        }
    }

    List<Integer> ans = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
        if(arr[i] != i+1){
            ans.add(i+1);
        }
    }

    return ans;
}

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
//        int[] arr = {1,1};
        List<Integer> ans = allMissing(arr);

        System.out.println(ans);
    }
}
