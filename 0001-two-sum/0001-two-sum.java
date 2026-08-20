class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(nums[0],0);
        for(int i=1;i<nums.length;i++)
        {
            int index=target-nums[i];
            if(map.containsKey(index))
            {
                return new int[]{map.get(index),i};
            }
            map.put(nums[i],i);
        }
        return null;
        
    }
}