// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;

//         // Make a copy of the matrix
//         int[][] copy = new int[m][n];
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 copy[i][j] = matrix[i][j];
//             }
//         }

//         // Use copy to detect zeroes, update matrix safely
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (copy[i][j] == 0) {
//                     for (int k = 0; k < m; k++)
//                         matrix[k][j] = 0;
//                     for (int t = 0; t < n; t++)
//                         matrix[i][t] = 0;
//                 }
//             }
//         }

//         // Print for checking
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        // Step 1: mark rows and cols
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Step 2: set zeroes
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
