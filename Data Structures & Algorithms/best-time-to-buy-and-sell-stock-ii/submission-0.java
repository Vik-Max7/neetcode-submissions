class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int minStockPrice = prices[0];

        for(int i=1; i<prices.length; i++){
            if(minStockPrice > prices[i]){
                minStockPrice = prices[i];
            }
            else{
                int currProfit = prices[i] - minStockPrice;
                maxProfit = maxProfit + currProfit;
                minStockPrice = prices[i];
            }
        }
        return maxProfit;
    }
}