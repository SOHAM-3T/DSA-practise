class armstrongNumber {
    static boolean armstrongNumber(int n) {
        // code here
        int num = 0;
        int x = n;
        int rem;
        while(x>0){
            rem = x%10;
            num += Math.pow(rem,3);
            x = x/10;
        }
        if(n==num){
            return true;
        }
        return false;
    }
}