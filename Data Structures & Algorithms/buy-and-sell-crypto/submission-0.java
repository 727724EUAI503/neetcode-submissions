class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            
            int pro=prices[i]-min;
            max=Math.max(max,pro);
            min=Math.min(prices[i],min);
        }
        return max;
    }
}
