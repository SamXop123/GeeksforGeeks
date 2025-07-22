// This one isn't the best approach but still works. Will clear most of the test cases except for one where it fails due time limit. The following code works in O(n^2) time complexity that is why it is not the most optimal approach for this problem. Approaching the array from the reverse order will help us do it under O(n) time.

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                list.add(arr[i]);
            }
        }

        return list;
    }
}
