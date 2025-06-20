class Solution:
    def nonRepeatingChar(self,s):
        
        char = {}
        min_freq = 10000000000
        min_char = ""
        
        for i in s:
            if i in char:
                char[i] += 1
            else:
                char[i] = 1
        
        for key in char:
            if char[key] < min_freq:
                min_freq = char[key]
                min_char = key
        
        if min_freq > 1:
            return -1
        else:
            return min_char
            
    