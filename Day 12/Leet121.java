class Solution {
    public int maxProfit(int[] prices) {
        int minProfit = Integer.MAX_VALUE; //Initialise the Minprofit to Max Integer
        int maxProfit = 0; //Maximum profit can be initialized safely to zero
        int profit = 0;
        for(int price : prices){
            if(price < minProfit){
                minProfit = price;
            }
            profit = price - minProfit;
            if (profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}