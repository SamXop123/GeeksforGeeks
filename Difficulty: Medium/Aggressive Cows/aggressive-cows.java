class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        int n = stalls.length;
        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[n-1] - stalls[0];
        int ans = 0;

        while(low <= high) {
            int mid = low + (high-low)/2;

            int count = 1;
            int last = stalls[0];
            for(int i = 1; i < n; i++) {
                if(stalls[i]-last >= mid) {
                    count++;
                    last = stalls[i];
                }
            }

            if(count >= k) {
                ans = mid;
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return ans;
        
    }
}