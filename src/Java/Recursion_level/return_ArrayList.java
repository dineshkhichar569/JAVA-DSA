package Java.Recursion_level;

import java.util.ArrayList;

public class return_ArrayList {
    public static ArrayList<Integer> find(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return find(arr, target, index+1, list);
    }

    public static ArrayList<Integer> find2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow =  find2(arr, target, index+1);

        list.addAll(ansFromBelow);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 3, 8, 9};
        int target = 4;

//        ArrayList<Integer> ans = find(arr, target, 0, new ArrayList<>());
//        System.out.println(ans);

        ArrayList<Integer> ans2 = find2(arr, target, 0);
        System.out.println(ans2);
    }
}
