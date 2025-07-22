class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        
        int maxFromRight = arr[n - 1];
        list.add(maxFromRight); 

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                list.add(maxFromRight);
            }
        }

        Collections.reverse(list);
        return list;
    }
}
