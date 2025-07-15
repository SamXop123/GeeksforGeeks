
class Solution {
    public String average(int arr[]) {
        
        int n = arr.length;
        int sum = 0;
        
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        
        double result = (double)sum/n;
        return String.format("%.2f", result);
    }
}