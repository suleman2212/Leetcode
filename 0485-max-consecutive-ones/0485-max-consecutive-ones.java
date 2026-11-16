class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int max=1;
        int cur=1;
        int onces=0;
        if(nums.length==1)
        {
            return nums[0]==1?1:0;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                if(nums[i]==1)
                {
                    onces++;
                    
                }
                continue;
            }
            if(nums[i]==0)
            {
                continue;
            }
            onces++;
            if(nums[i]==nums[i-1])
            {
                cur++;
            }else{
                cur=1;
            }
            if(cur>max)
            {
                max=cur;
                
            }
        }
        return onces>0?max:0;
        
    }
}