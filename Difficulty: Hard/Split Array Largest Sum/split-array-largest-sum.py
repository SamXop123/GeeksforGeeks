class Solution:
    def splitArray(self, arr, k):
        
        low = max(arr)             
        high = sum(arr)            
        answer = high
    
        while low <= high:
            mid = (low + high) // 2
            count = 1             
            current_sum = 0
    
            for num in arr:
                if current_sum + num > mid:
                    count += 1
                    current_sum = num
                else:
                    current_sum += num
    
            if count <= k:
                answer = mid       
                high = mid - 1
            else:
                low = mid + 1      
    
        return answer