#User function Template for python3

class Solution:
	def pushZerosToEnd(self,arr):
    	
    	newArr = []
    	zeroArr = []
    	
    	for i in arr:
    	    if(i != 0):
    	        newArr.append(i)
    	    else:
    	        zeroArr.append(i)
    	        
    	arr[:] = newArr + zeroArr
        

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ob.pushZerosToEnd(arr)
        for x in arr:
            print(x, end=" ")
        print()
        tc -= 1
        print("~")
# } Driver Code Ends