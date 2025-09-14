class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        int maxPrime = -1;
        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }
        while (n % 3 == 0) {
            maxPrime = 3;
            n = n / 3;
        }
        // Check for odd factors starting from 5 and
        // incrementing by 6 (i and i+2)
        for (int i = 5; i * i <= n; i += 6) {
            while (n % i == 0) {
                maxPrime = i;
                n = n / i;
            }
            while (n % (i + 2) == 0) {
                maxPrime = i + 2;
                n = n / (i + 2);
            }
        }

        if (n > 4) {
            maxPrime = n;
        }

        return maxPrime;
    }
}