class Solution:
    def missingNum(self, arr):
        
        arr.sort()
        for i in range(len(arr)):
            if arr[i] != i + 1:
                return i + 1
        return len(arr) + 1
        
    

        