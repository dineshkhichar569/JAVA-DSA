package Java.Math_DSA;

import java.util.Arrays;

public class LC_832_Flipping_an_Image {
    public static int[] flipAndInvertImage1d(int[] image) {
        int s = 0;
        int e = image.length-1;
        // to flip an array
        while(s <= e){
            int swap = image[s];
            image[s] = image[e];
            image[e] = swap;
            s++;
            e--;
        }
        System.out.println(Arrays.toString(image));

        // to invert image
        s = 0;
        e = image.length-1;
        while (s <= e){
            if(image[s] == 1){
                image[s] = 0;
            }else {
                image[s] = 1;
            }
            s++;
        }

        return image;
    }

    public static int[][] flipAndInvertImage2d(int[][] image) {

        int sr = 0;
        int r = image.length-1;  // number of rows

        System.out.println(Arrays.deepToString(image));
        System.out.println();

        // to flip an array
        while (sr <= r){
            int sc = 0;
            int c = image[0].length-1;  // number of columns
            while (sc <= c){
                int swap = image[sr][sc];
                image[sr][sc] = image[sr][c];
                image[sr][c] = swap;
                sc++;
                c--;
            }
            sr++;
        }
        System.out.println(Arrays.deepToString(image));
        System.out.println();

        // to flip elements
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                image[i][j] = image[i][j] == 1 ? 0 : 1;
            }
        }
        System.out.println("Flip and Invert Image 2d result : ");
        return image;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0,0}, //{0,0,1,1}
                {1,0,0,1}, //{1,0,0,1}
                {0,1,1,1}, //{1,1,1,0}
                {1,0,1,0}  //{0,1,0,1}
        };

        int[][] ans = flipAndInvertImage2d(arr);
        System.out.println(Arrays.deepToString(ans));
    }
}
