class Solution:
    # Function to sort an array of 0s, 1s, and 2s
    def sort012(self, arr):
        
        count0 = arr.count(0)
        count1 = arr.count(1)
        count2 = arr.count(2)
    
        new_arr = []

        for _ in range(count0):
            new_arr.append(0)
        
        for _ in range(count1):
            new_arr.append(1)
        
        for _ in range(count2):
            new_arr.append(2)
        
        for i in range(len(arr)):
            arr[i] = new_arr[i]
        
        return arr