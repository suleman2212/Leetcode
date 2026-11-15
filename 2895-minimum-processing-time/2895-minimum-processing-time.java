class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) 
    {
        Collections.sort(processorTime);
        // tasks.sort(Collections.reverseOrder());
        tasks.sort((a,b)->Integer.compare(b,a));
        int max=0;
        for(int i=0;i<processorTime.size();i++)
        {
            for(int j=0;j<4;j++)
            {
                max=Math.max(max,processorTime.get(i)+tasks.remove(0));
            }
        }
        return max;
        
        
        
    }
}