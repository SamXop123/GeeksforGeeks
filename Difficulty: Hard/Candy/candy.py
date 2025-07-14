#User function Template for python3

class Solution:
    def minCandy(self, arr):
       
        n = len(arr)              
        candies = [1] * n           
    
        i = 1
        while i < n:
            if arr[i] > arr[i - 1]:
                candies[i] = candies[i - 1] + 1
            i += 1
    
        i = n - 2
        while i >= 0:
            if arr[i] > arr[i + 1]:
                if candies[i] <= candies[i + 1]:
                    candies[i] = candies[i + 1] + 1
            i -= 1
    
        total = 0
        i = 0
        while i < n:
            total = total + candies[i]
            i += 1
    
        return total

