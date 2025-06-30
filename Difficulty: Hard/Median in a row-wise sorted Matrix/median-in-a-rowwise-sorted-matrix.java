import java.util.Arrays;

class Solution {
    int median(int mat[][]) {
      
        int rows = mat.length;
        int cols = mat[0].length;
        int arrLength = rows*cols;
    
        int[] arr = new int[arrLength];

        int index = 0;
        for (int[] row : mat) {
            for (int num : row) {
                arr[index++] = num;
            }
        }

        Arrays.sort(arr);
        
        int n = arr.length;
        return arr[n / 2];
      
    }
}

