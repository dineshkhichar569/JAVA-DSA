package Java.Heap_Sort;
import java.util.Arrays;

public class Heap_Sort {
    public static void heapily(int[] arr, int n, int i){
        int largest = i;
        int l = 2*i;
        int r = 2*i + 1;
        if(l <= n && arr[l] > arr[largest]){
            largest = l;
        }
        if(r <= n && arr[r] > arr[largest]){
            largest = r;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapily(arr, n, largest);
        }
    }
    public static void heapSort(int[] arr, int n){
        for (int i = n; i > 0 ; i--) {
            int temp = arr[i];
            arr[i] = arr[1];
            arr[1] = temp;
            heapily(arr, i-1, 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 30, 50, 20, 35, 15};
        heapSort(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
