class Solution {
    public static int balanceSums(int[][] mat) {

        int n = mat.length;
        int[] rowSums = new int[n];
        int[] colSums = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSums[i] += mat[i][j];
                colSums[j] += mat[i][j];
            }
        }
        
        int maxRowSum = 0;
        int maxColSum = 0;
        for (int i = 0; i < n; i++) {
            if (rowSums[i] > maxRowSum) {
                maxRowSum = rowSums[i];
            }
            if (colSums[i] > maxColSum) {
                maxColSum = colSums[i];
            }
        }
        
        int target = Math.max(maxRowSum, maxColSum);
        
        int operations = 0;
        for (int i = 0; i < n; i++) {
            operations += target - rowSums[i];
        }
        
        return operations;
    }
}
