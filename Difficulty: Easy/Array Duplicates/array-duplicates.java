class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        int n = arr.length;
        int[] freq = new int[n + 1];
        
        for (int num : arr) {
            freq[num]++;
        }
        
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                duplicates.add(i);
            }
        }
        
        return duplicates;
    }
}