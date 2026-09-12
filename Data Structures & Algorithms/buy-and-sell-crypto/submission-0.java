class Solution {
    public int maxProfit(int[] prices) {
       
        int minbuyprice=Integer.MAX_VALUE;
        int maxsellprice=Integer.MIN_VALUE;
        int maxprofit=0;
       for(int i=0;i<prices.length;i++){
        int profit=0;
        minbuyprice=prices[i];
        maxsellprice=Integer.MIN_VALUE;
        for(int j=i+1;j<prices.length;j++){
            maxsellprice=Math.max(maxsellprice,prices[j]);
        }
        if(maxsellprice!=Integer.MIN_VALUE){
        profit=maxsellprice-minbuyprice;
        maxprofit=Math.max(maxprofit,profit);
        }
       }
        
        return maxprofit;
    }
}
