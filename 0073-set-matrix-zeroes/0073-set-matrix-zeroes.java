import java.util.ArrayList;
import java.util.List;

class Solution {

    // Method to set the matrix elements to zero based on the rules
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int col0 = 1;

        // Step 1: Traverse the matrix and mark the first row & column accordingly
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // Mark the i-th row
                    matrix[i][0] = 0;

                    // Mark the j-th column
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        // Step 2: Use the marks to set elements to zero from (1,1) to (n-1, m-1)
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] != 0) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // Step 3: Finally set the first row and first column to zero if needed
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        // Example usage of the setZeroes method

        // Creating a matrix using a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        // Calling the setZeroes method
        setZeroes(matrix);

        // Printing the modified matrix
        System.out.println("Matrix after applying setZeroes:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
