package LeetCode;

import java.util.Arrays;

public class LC_1672_richest_customer_wealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] row = new int[accounts.length];

        // 1st forloop is row
        // 2nd forloop is coloum
        for(int i = 0; i < accounts.length; i++){
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
//                sum = sum + accounts[j][i];  // for coloum sum
                sum = sum + accounts[i][j];   // for row sum
            }
            row[i] = sum;
        }
        System.out.println(Arrays.toString(row));

        int rich = row[row.length-1];
        for (int i = 0; i < row.length-1; i++) {
            if(row[i] > rich){
                rich = row[i];
            }
        }
        System.out.println(rich);

    }
}