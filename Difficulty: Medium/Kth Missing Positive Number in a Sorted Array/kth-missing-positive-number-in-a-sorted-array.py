#User function Template for python3
class Solution:
    def kthMissing(self, arr, k):
        
        missingCount = 0
        current = 1 
        idx = 0
        
        while True:
            if idx < len(arr) and arr[idx] == current :
                idx += 1
            else:
                missingCount += 1
                if missingCount == k:
                    return current
            current += 1
            
            
#{ 
 # Driver Code Starts
#Initial Template for Python 3

#Main
if __name__ == '__main__':
    t = int(input())
    while t:
        t -= 1
        A = [int(x) for x in input().strip().split()]
        nd = [int(x) for x in input().strip().split()]
        D = nd[0]
        ob = Solution()
        ans = ob.kthMissing(A, D)
        print(ans)
        print("~")

# } Driver Code Ends