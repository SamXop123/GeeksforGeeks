class Solution {

    private int atMostK(String s, int k) {
        if (k < 0) return 0;

        int n = s.length();
        int left = 0;
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.get(ch) == 1) {
                k--;
            }

            while (k < 0) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    k++;
                }
                left++;
            }

            res += right - left + 1;
        }

        return res;
    }

    public int countSubstr(String s, int k) {
        return atMostK(s, k) - atMostK(s, k - 1);
    }
}
