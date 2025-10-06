class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        while(n>2){
            if(n%3!=0){
                return false;
            }
            n/=3;
        }
        if(n==1){
            return true;
        }
        else{
            return false;
        }

    }
}