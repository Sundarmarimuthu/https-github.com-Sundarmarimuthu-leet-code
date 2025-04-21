class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int in=0;
        int p=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]<min) {
                min=prices[i];
            }
            p=Math.max(p,prices[i]-min);
        }
        return p;
    
    }
}