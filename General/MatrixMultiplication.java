public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        int[][] B = {
                {25, 24, 23, 22, 21},
                {20, 19, 18, 17, 16},
                {15, 14, 13, 12, 11},
                {10,  9,  8,  7,  6},
                { 5,  4,  3,  2,  1}
        };
        float StartTime = (System.nanoTime())/1000000;
        System.out.println("Start Time : "+StartTime);
        int[][] C = multiplyMatrices(A, B);
        float EndTime = (System.nanoTime())/1000000;
        System.out.println("End Time : "+EndTime);


        System.out.println("Time taken = "+(EndTime-StartTime)/1000);

        // Print the result matrix C
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int m = A.length;    // Number of rows in A
        int n = A[0].length; // Number of columns in A (also rows in B)
        int p = B[0].length; // Number of columns in B

        int[][] C = new int[m][p]; // Result matrix C

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }

        return C;
    }
}
