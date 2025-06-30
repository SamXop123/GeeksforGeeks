#User function Template for python3

class Solution:
    def median(self, mat):
    	
    	arr = []
    	for i in mat:
    	    arr.extend(i)
    	    
    	arr.sort()
    	
    	n = len(arr)
    	median = arr[n//2]
    	
    	return median