class Solution {
    public void nearlySorted(int[] arr, int k) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= Math.max(0, i - k) && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

    }
}

  