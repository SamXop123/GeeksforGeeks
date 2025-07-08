import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        int duplicate = -1;
        long expectedSum = 0;  
        long actualSum = 0;    
        
        for (int i = 0; i < n; i++) {
            if (i < n-1 && arr[i] == arr[i+1]) {
                duplicate = arr[i];
            }
            actualSum += arr[i];
        }
        
        expectedSum = (long)n * (n + 1) / 2;
        
        int missing = (int)(expectedSum - (actualSum - duplicate));
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(duplicate);
        result.add(missing);
        return result;
    }
}