package BSON2D;

import java.util.Arrays;

public class leetcode74 {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50},
        };
        int target = 29;
        System.out.println(Arrays.toString(rolcol(arr, target)));
    }

    static int[] rolcol(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            // Only check the row if target could exist in it
            if (arr[row][0] <= target && arr[row][arr[0].length - 1] >= target) {
                int col = binarySearch(arr[row], target); //  Pass the row array
                if (col != -1) {
                    return new int[]{row, col}; // Found
                }
            }
        }
        return new int[]{-1, -1}; // Not found
    } 

    static int binarySearch(int[] row, int target) {
        int low = 0, high = row.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (row[mid] == target) return mid;
            else if (row[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
