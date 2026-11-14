class Solution {
    public int rob(int[] nums) 
    {
        
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
        int[] db=new int[n];
        
        db[0]=nums[0];
        db[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++)
        {
            db[i]=Math.max(db[i-1],nums[i]+db[i-2]);
        }
        return db[n-1];
    }
    
}