package Sliding_Window;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC_2269 {
    public static int divisorSubstrings(int n, int k) {
        List<Integer> list = new ArrayList<>();
        int c1 = n;
        while(c1 != 0){
            list.add(c1 % 10);
            c1 /= 10;
        }

        Collections.reverse(list);

        int i = 0;
        int j = 0;
        int d = 0;
        int ans = 0;
        while(j != list.size()){
            if(j-i+1 < k){
                d = d*10 + list.get(j);
                j++;
            } else {
                d = d*10 + list.get(j);

                if(d != 0 && n%d == 0){
                    ans++;
                    i = j;
                    d = 0;
                } else{
                    i = j;
                    d = 0;
                }
            }
        }

        return ans;
    }

    static void main() {
        System.out.println(divisorSubstrings(10, 1));
    }
}
