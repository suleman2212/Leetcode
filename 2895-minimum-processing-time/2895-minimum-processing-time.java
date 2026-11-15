class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) 
    {
        Collections.sort(processorTime);
        // tasks.sort(Collections.reverseOrder());
        Collections.sort(tasks);
        int max=0;
        int j=tasks.size()-1;
        
        for(int i=0;i<processorTime.size();i++)
        {
            int c=0;
            while(c<4)
            {
                max=Math.max(max,processorTime.get(i)+tasks.get(j));
                c++;
                j--;
            }
        }
        return max;
        
        
        
    }
}