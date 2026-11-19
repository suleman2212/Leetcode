class Solution {
    int sum;
    public int subsetXORSum(int[] nums) 
    {
        sol(nums,0,0); 
        // System.out.println(sum);  
        return sum;  
    }
    void sol(int[] nums,int idx,int xor)
    {
        if(idx==nums.length)
        {
            sum+=xor;
            return;
        }
        sol(nums,idx+1,xor^nums[idx]);
        sol(nums,idx+1,xor);
        
    }
}