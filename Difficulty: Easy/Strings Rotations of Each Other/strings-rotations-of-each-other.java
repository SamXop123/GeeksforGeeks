class Solution {
    public static boolean areRotations(String s1, String s2) {
        
        if (s1.length() == s2.length()) {
            char[] s1Array = s1.toCharArray();
            char[] s2Array = s2.toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            
            if (Arrays.equals(s1Array, s2Array)) {
                String concatenated = s1 + s1;
                return concatenated.contains(s2);
            }
        }
        return false;
        
    }
}
