package BSON2D;

import java.util.Arrays;

public class rolcolmatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 },
        };

        System.out.println(Arrays.toString(rolcol(arr, 38)));
    }

    static int[] rolcol(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;
        while (row < arr.length && col >= 0) {
            // 3checks
            if (arr[row][col] == target) {
                return new int[] { row, col };
            }
            // mltb number chota hai target se toh row ignore kro
            // aur aage bhejdo
            else if (arr[row][col] < target) {
                row++;
            } else
                col--;
        }
        return new int[] { -1, -1 };
    }
}
