class Solution:
    def checkStatus(self, a, b, flag):
        
        if flag == False:
            if (a >= 0 and b < 0) or (a < 0 and b >= 0):
                return True
            else:
                return False
        else:
            if a < 0 and b < 0:
                return True
            else:
                return False