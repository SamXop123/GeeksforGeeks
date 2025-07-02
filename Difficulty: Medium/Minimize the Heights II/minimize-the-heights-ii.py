#User function Template for python3

class Solution:
    def getMinDiff(self, arr,k):
        
        arr.sort()
        n = len(arr)
        ans = arr[-1] - arr[0]
        
        if n == 1:
            return 0
        
        small = arr[0] + k
        big = arr[-1] - k
        
        for i in range(n):
            if arr[i] - k < 0:
                continue
        
            min_element = min(small, arr[i]-k)
            max_element = max(big, arr[i-1]+k)
            
            ans = min(ans, max_element - min_element)
            
        return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        k = int(input())
        # n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.getMinDiff(arr, k)
        print(ans)
        print("~")
        tc -= 1

# } Driver Code Ends