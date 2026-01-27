// TLE 

class Solution {
    public int countSubstr(String s, int k) {
        int n = s.length();
        int res = 0;

        for(int i = 0; i < n; i++) {
            Map<Character, Integer> map = new HashMap<>();
            int distinct = 0;

            for(int j = i; j < n; j++) {
                char ch = s.charAt(j);

                if(!map.containsKey(ch)) {
                    distinct++;
                }
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if(distinct == k) {
                    res++;
                } else if(distinct > k) {
                    break;
                }
            }
        }
        return res;
    }
}
