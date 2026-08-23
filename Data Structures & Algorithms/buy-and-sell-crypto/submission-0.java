class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int profit = 0;
        int max = 0;

        for(int i = 0;i<n;i++){
            int j = i+1;
            while(j<n){
                if(prices[i]<prices[j]){
                    profit = prices[j]-prices[i];
                }
                max = Math.max(max,profit);
                j++;
            }
        }

        return max;
        
    }
}
