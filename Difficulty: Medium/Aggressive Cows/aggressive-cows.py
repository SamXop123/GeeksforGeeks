class Solution:

    def aggressiveCows(self, stalls, k):
        
        stalls.sort()
        
        first = 1
        last = stalls[-1] - stalls[0]
        result = 0
        
        while first <= last :
            mid = (first + last) // 2
            
            cows = 1
            end = stalls[0]
            
            for i in range(1, len(stalls)):
                if stalls[i] - end >= mid :
                    cows += 1
                    end = stalls[i]
                    
            if cows >= k :
                result = mid
                first = mid + 1
            else:
                last = mid - 1
                
        return result



#{ 
 # Driver Code Starts
#Initial Template for Python 3
import bisect
#Main
if __name__ == '__main__':
    t = int(input())
    while t:
        t -= 1
        A = [int(x) for x in input().strip().split()]
        nd = [int(x) for x in input().strip().split()]
        D = nd[0]
        ob = Solution()
        ans = ob.aggressiveCows(A, D)
        print(ans)
        print("~")
# } Driver Code Ends