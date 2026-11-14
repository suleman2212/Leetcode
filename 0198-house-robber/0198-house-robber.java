class Solution {
    public int rob(int[] nums) 
    {
        
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
        // int[] db=new int[n];
        
        int first=nums[0];
        int sec=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++)
        {
            int cur=Math.max(sec,nums[i]+first);
            first=sec;
            sec=cur;
        }
        return sec;
    }
    
}