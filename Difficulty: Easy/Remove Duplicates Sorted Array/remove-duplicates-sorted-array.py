#User function template for Python

class Solution:
    def removeDuplicates(self, arr):
        
        tracker = set()
        
        idx = 0

        for i in range(len(arr)):
            if arr[i] not in tracker:
                tracker.add(arr[i])
                arr[idx] = arr[i]
                idx += 1
        
        return idx