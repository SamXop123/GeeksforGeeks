import heapq

class Solution:
    def kSmallestPair(self, arr1, arr2, k):
        n1 = len(arr1)
        n2 = len(arr2)
        ans = []

        heap = []

        for i in range(min(k, n1)):
            heapq.heappush(heap, (arr1[i] + arr2[0], i, 0))

        while heap and len(ans) < k:
            curr_sum, i, j = heapq.heappop(heap)
            ans.append([arr1[i], arr2[j]])

            if j + 1 < n2:
                heapq.heappush(heap, (arr1[i] + arr2[j + 1], i, j + 1))

        return ans
