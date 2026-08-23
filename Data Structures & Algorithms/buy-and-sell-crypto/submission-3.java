class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int profit = 0;
        int max = 0;

        if (n == 1) return 0;

        int[] minL = new int[n];

        minL[0] = prices[0];
        int left = 1;
        while (left < n) {
            minL[left] = Math.min(minL[left-1], prices[left-1]);
            left++;
        }

        for(int i=0;i<n;i++){
            profit = prices[i]-minL[i];
            max = Math.max(profit, max);
        }

        return max;
        
    }
}
