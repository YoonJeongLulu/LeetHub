class Solution {
    public int maxProfit(int[] prices) {
        int lowest_price = prices[0];
        int profit = 0;
        for(int curr_price: prices){
            lowest_price = Math.min(lowest_price, curr_price);
            profit = Math.max(profit, curr_price-lowest_price);
        }
        
        return profit;
        
    }
}