package Java.Recursion_Interview_Questions;

import java.util.ArrayList;
import java.util.List;

public class LC_264_Ugly_Number_2 {

    public static int nthUglyNumber(int n) {
        int[] num = new int[n];
        num[0] = 1;
        int ugly = 0;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;

        for (int i = 1; i < n; i++) {
            num[i] = Math.min(Math.min(num[i2]*2, num[i3]*3), num[i5]*5);
            ugly = num[i];

            if(ugly == num[i2]*2) i2++;
            if(ugly == num[i3]*3) i3++;
            if(ugly == num[i5]*5) i5++;
        }
        return num[n-1];
    }

    public static int factorNo(int n){
        int count = 1;
        if(n==1) return count;
        int ans = 0;
        int i = 2;
        while (count < n){
            int x = i;
            while(x%2==0) x/=2;
            while(x%3==0) x/=3;
            while(x%5==0) x/=5;
            if(x==1){
                count++;
                if(count == n){
                    ans = i;
                    break;
                }
            }
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(factorNo(n));
    }
}
