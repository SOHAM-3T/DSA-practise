class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int x = numBottles;
        int sum = x;
        while(x>=numExchange){
            for(int i=0;i<numExchange;i++){
                if(x>=numExchange){
                    sum+=1;
                    x-=numExchange-1;
                }
            }
        }
        return sum;
    }
}