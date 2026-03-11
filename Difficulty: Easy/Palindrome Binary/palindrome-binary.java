// User function Template for Java

class Solution {
    static int isPallindrome(long N) {
        String s = Long.toBinaryString(N);
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return 0;
            }
            left++;
            right--;
        }

        return 1;
    }
}