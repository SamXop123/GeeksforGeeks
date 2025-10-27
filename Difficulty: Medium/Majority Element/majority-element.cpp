class Solution {
  public:
    int majorityElement(vector<int>& arr) {
        int n = arr.size();
        int candidate = -1;
        int count = 0;
        
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        count = 0;
        for (int num : arr) {
            if (num == candidate) count++;
        }
        
        if (count > n/2) return candidate;
        return -1;
    }
};
