

class Solution {
    static boolean isPrime(int x) {
        if (x <= 1) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x%i == 0) return false;
        }
        return true;
    }
    
    public int[] prime_pairs(int n) {
        List<Integer> res = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                for (int j = 2; j <= n/i; j++) {
                    if (isPrime(j)) {
                        res.add(i);
                        res.add(j);
                    }
                }
            }
        }
        
        int arr[] = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }

        return arr;
    }
}