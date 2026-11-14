class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
        return Math.max(robs(nums,0,n-2),robs(nums,1,n-1));
    }
    int robs(int[] nums,int start,int end)
    {
        if(end<2)
        {
            return nums[start];
        }
        int first=nums[start];
        int sec=Math.max(first,nums[start+1]);
        for(int i=start+2;i<=end;i++)
        {
            int cur=Math.max(nums[i]+first,sec);
            first=sec;
            sec=cur;
            
        }
        return sec;
    }
}