package Linked_List.Questions;

import java.util.ArrayList;

public class LC_25_Reverse_Nodes_in_k_Group {

    public static void reverseInGroup(ArrayList<Integer> list, int k){
        int n = list.size()/k;
        int x = 0;
        int y = k;
        int i = k;

        while(n != 0){
            if(y <= list.size()){
                while(x < y-1){
                    int temp =  list.get(x);
                    list.set(x, list.get(y-1));
                    list.set(y-1, temp);
                    x++;
                    y--;
                }
                y = i + k;
                x = i;
                i = y;
            }
            n--;
        }
        System.out.println(list);
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        reverseInGroup(list, 2);

    }
}
