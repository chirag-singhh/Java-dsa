package BSON2D;


public class zeroone {
    public static void main(String[] args) {
        int[][] arr = {
        {0,0,0,0,0,1,1,1,1},
        {0,0,0,0,0,0,1,1,1},
        {0,0,0,1,1,1,1,1,1},
        {0,0,0,0,1,1,1,1,1}
    };

        System.out.println((rolcol(arr)));
    }

    static int rolcol(int[][] arr){
            int rows = arr.length;
            int cols = arr[0].length;
            for(int col = 0; col < cols;col++){
                for (int row = 0 ; row < rows ; row++){
                    if (arr[row][col] == 1) {
                        return row;
                    }
                } 
            }
            return -1;
        }
       
    }
    
