// User function Template for Java
import java.util.Arrays;

class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                i++;
                j++;
            } else if (a[i] < b[j]) {
                return false; 
            } else {
                j++;
            }
        }
        
        if(i == a.length) {
            return true;
        } else {
            return false;
        }
    }
}