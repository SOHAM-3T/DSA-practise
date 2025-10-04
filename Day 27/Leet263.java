class Solution {
    public boolean isUgly(int n) {
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        int[] p = {2,3,5};
        for(int i : p){
            while(n%i==0){
                n=n/i;
            }
        }
        if(n==1){
            return true;
        }
        return false;
    }
}