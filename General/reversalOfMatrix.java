import java.util.Arrays;

public class reversalOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int[] n:matrix){
            System.out.println("Original : "+Arrays.toString(n));
        }
        rotate(matrix);
    }

    public static  void rotate(int[][] matrix) {
        // Transpose of a matrix
        for(int row=0; row<matrix.length;row++){
            for(int column=row; column<matrix[row].length;column++){
                int temp=matrix[row][column];
                matrix[row][column] = matrix[column][row];
                matrix[column][row] = temp;
            }
        }

        for (int[] n:matrix){
            System.out.println("After transpose : "+Arrays.toString(n));
        }

        // Reversal of each row of the matrix
        for(int row=0;row<matrix.length;row++){
            for(int column=0; column< matrix.length/2;column++){
                int temp=matrix[row][column];
                matrix[row][column] = matrix[row][matrix.length-1-column];
                matrix[row][matrix.length-1-column] = temp;
            }
        }
        for (int[] n:matrix){
            System.out.println("After reversal : "+Arrays.toString(n));
        }
    }
}
