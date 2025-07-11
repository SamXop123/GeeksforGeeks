class Solution {
    public static int nextPrime(int n) {
    
        if (n < 2) return 2; 
        
        int num = n + 1;
        while (true) {
            boolean isPrime = true;
            
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            
            if (isPrime) {
                return num;
            }
            num++;
        }
    }
}
