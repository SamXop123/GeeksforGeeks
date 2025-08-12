class Solution {
    public static boolean isPowerofTwo(int n) {
        if (n <= 0) {
            return false;
        }
        
        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }
        return true;
        
    }
}