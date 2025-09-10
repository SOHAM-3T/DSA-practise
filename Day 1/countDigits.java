class Solution {
    public int countDigits(int n) {
        // code here
        int count = 0;
        int x = n;
        while(x>0){
            x = x/10;
            count+=1;
        }
        return count;
    }
}
