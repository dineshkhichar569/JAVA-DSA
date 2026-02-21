package Array;

public class LC_3840 {
        public static long rob(int[] arr, int[] colors) {

            long count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (i + 1 < arr.length && colors[i] == colors[i + 1]) {
                    if (arr[i] > arr[i + 1]) {
                        count += arr[i];
                    } else {
                        count += arr[i + 1];
                    }
                    i++;
                } else {
                    count += arr[i];
                }
            }

            return count;
        }

    static void main() {
        int[] arr = {64,86,10};
        int[] colors = {2,2,2};

        System.out.println(rob(arr, colors));
    }
}
