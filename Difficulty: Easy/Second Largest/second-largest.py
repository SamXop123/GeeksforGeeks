class Solution:
    def getSecondLargest(self, arr):
        arr = list(set(arr))
        arr.sort(reverse=True)
        if len(arr) >= 2 :
            return arr[-(len(arr)-1)]
        else:
            return -1