class Solution {
    public static int gcd(int a, int b) {
        // code here
        int originalA = a, originalB = b;
        a = Math.max(originalA, originalB);
        b = Math.min(originalA, originalB);
        
        int rem = a%b;
        if(rem == 0){
            return b;
        }
        while(rem!=0){
            a = b;
            b = rem;
            rem = a%b;
        }
        return b;
    }
}
