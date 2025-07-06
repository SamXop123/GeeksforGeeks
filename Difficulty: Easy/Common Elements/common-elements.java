import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList<Integer> common = new ArrayList<>();
        
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                common.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        return common;
    }
}
