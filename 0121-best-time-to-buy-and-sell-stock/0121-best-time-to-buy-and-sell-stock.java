class Solution {
    public int maxProfit(int[] prices) {
        int buy_Price=prices[0],profit=0;
        int max_Profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>buy_Price){
              profit=prices[i]-buy_Price;
              max_Profit=Math.max(max_Profit,profit);
            }else{
                buy_Price=prices[i];
            }
        }
        return max_Profit;
    }
}