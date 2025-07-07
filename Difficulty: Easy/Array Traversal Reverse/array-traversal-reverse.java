class Solution {
    public static void arrayTraversalReverse(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}