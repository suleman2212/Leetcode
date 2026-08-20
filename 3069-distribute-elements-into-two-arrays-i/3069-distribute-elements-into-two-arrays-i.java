class Solution {
    public int[] resultArray(int[] nums) 
    {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            int n1=arr1.size()-1;
            int n2=arr2.size()-1;
            if(arr1.get(n1)>arr2.get(n2))
            {
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
        } 
        int[] ans=new int[nums.length];
        int count=0;
        for(int i=0;i<arr1.size();i++)
        {
            ans[count++]=arr1.get(i);
        } 
        for(int i=0;i<arr2.size();i++)
        {
            ans[count++]=arr2.get(i);
        }  
        return ans;       
    }
}