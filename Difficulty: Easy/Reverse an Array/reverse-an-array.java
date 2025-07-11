class Solution {
    public int[] reverseArray(int arr[]) {
        
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
        
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
        
    }
}


// MEANWHILE PYTHON 😂😂:
/* 
def reverseArray(arr):
    arr.reverse()
    return arr
*/
