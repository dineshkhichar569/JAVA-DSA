package Math;

public class LC_69 {
    public static int maximum69Number (int num) {
        int count = 0;
        int copy = num;
        while(copy != 0){
            count++;
            copy/=10;
        }
        int n = num;
        int[] arr = new int[count];
        for(int i = count-1; i>=0; i--){
            arr[i] = n%10;
            n/=10;
        }

        int x = num;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 9){
                arr[i] = 6;
            }else{
                arr[i] = 9;
            }

            ///////////////////////
            int d = 0;
            for(int j = 0; j < arr.length; j++){
                d = d * 10 + arr[j];
            }
            if(d > x){
                x = d;
            }
            //////////////////

            if(arr[i] == 9){
                arr[i] = 6;
            }else{
                arr[i] = 9;
            }

        }
        return x;
    }
    static void main() {
        int num = 9669;
        System.out.println(maximum69Number(num));
    }
}
