import java.util.Arrays;

public class leetcoodde73 {
    public static void main(String[] args) {
        int[][] matrix = {
        {1,1,1},
        {1,0,1},
        {1,1,1}
    };
    System.out.println(Arrays.toString(Solution(matrix)));   
    }
    static int[] Solution(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int row = 0; row < rows ; row++){
            for(int col = 0 ; col < cols ; col++){
                if (matrix[row][col] == 0) {
                    return new int[] {row,col};
                }
            }
        }
        
        
        //if nothing found
        return new int[] {-1,-1};
    }
}
