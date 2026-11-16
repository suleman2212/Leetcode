class Solution {
    public int findLength(int[] nums1, int[] nums2) 
    {
        int n=nums1.length;
        int m=nums2.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int count=0;
                while(i+count<n && j+count<m && nums1[i+count]==nums2[count+j])
                {
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}