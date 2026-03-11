class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int sum = 0;
        
        for(int right = 0; right < n; right++) {
            sum += arr[right];
            
            while(sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }
            
            if(sum == target) {
                ArrayList<Integer> res = new ArrayList<>();
                res.add(left+1);
                res.add(right+1);
                return res;
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        res.add(-1);
        return res;
    }
}