class Solution {
    public int maximumSaleItems(int[][] items, int budget) 
    {
        int n=items.length;
        int[] dp=new int[budget+1];
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int price=items[i][1];
            int factor=items[i][0];
            int count=1;
            minPrice=Math.min(minPrice,price);
            //count items and free items
            for(int j=0;j<n;j++)
            {
                if(i != j && items[j][0] % factor == 0)
                {
                    count++;
                }
            }
            for(int j=budget;j>=price;j--)
            {
                dp[j]=Math.max(dp[j],dp[j-price]+count);
            }

        }
        int ans=0;
        for(int i=0;i<=budget;i++)
        {
            int rem=budget-i;
            int extra=rem/minPrice;
            ans=Math.max(ans,dp[i]+extra);
        }
        return ans;



    }
}