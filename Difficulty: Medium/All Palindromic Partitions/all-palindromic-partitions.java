import java.util.*;

class Solution {
    
    public ArrayList<ArrayList<String>> palinParts(String s) {
        
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        
        func(s, ans, new ArrayList<>(), 0);
        
        return ans;
    }

    public void func(String s,
                     ArrayList<ArrayList<String>> ans,
                     ArrayList<String> curr,
                     int idx) {
        
        if(idx == s.length()) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i = idx; i < s.length(); i++) {
            
            String part = s.substring(idx, i + 1);

            if(isPalindrome(part)) {
                
                curr.add(part);
                
                func(s, ans, curr, i + 1);
                
                curr.remove(curr.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String str) {
        
        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }

        return true;
    }
}