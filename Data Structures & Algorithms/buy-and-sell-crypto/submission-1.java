class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE ;
        int ans = 0 ;

        for(int i = 0 ; i < prices.length ; i++){
            minPrice = Math.min(minPrice, prices[i]);
            ans = Math.max(ans, prices[i] - minPrice);
        }

        return ans ;
    }
}
