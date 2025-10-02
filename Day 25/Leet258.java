class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        int result = helper(num);
        return addDigits(result);
    }
    public int helper(int num){
        int y = num;
        int sum = 0;
        int rem = 0;
        while(y>0){
            rem = y%10;
            y = y/10;
            sum += rem;
        }
        return sum;
    }
}