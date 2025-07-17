package BSON2D;

import java.util.Arrays;

public class leetcode74optimize {
      public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {45, 55, 65, 75},
                {80, 85, 89, 100},
                {133, 134, 138, 150},
        };
        int target = 134;
        System.out.println(Arrays.toString(Search(arr, target)));
    }
     static int[] Search(int[][] arr, int target) {
       int n = arr.length; //rows
//cols
       int m = arr[0].length;
       int start = 0 ;
       int end = n*m-1;
       while (start<=end) {
        int mid = start + (end -start)/2;
        int row = mid/m;
        int col = mid %m;
        if (arr[row][col]== target) {
            return new int [] {row,col};
        }else if (arr[row][col] < target) {
            start = mid+1;
        }else end = mid-1;
       } return new int [] {-1,-1};
        }
    
    } 

