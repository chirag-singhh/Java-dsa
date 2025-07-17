package BSON2D;

import java.util.Arrays;

public class leetcode240 {
    public static void main(String[] args) {
         int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50},
        };
        int target = 29;
        System.out.println(Arrays.toString(Search(arr, target)));
    }

    static int[] Search (int [][] arr , int target){
       
       
        for( int row = 0; row < arr.length;row++){
            if (arr[row][0] < target && arr[row][arr[0].length-1]>target) {
             int col =   binarySearch(arr[row],target);
             if (col != -1) {
                    return new int[]{row, col}; // Found
                }
            }
        } return new int[] {-1,-1};
    }
    static int binarySearch(int []arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end - start)/2;
            if (arr[mid]== target) {
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid+1;
            }else end = mid-1;
        }return -1;
    }
}
