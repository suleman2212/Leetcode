class Solution {
    static {
        for(int i = 0; i < 500; i++) minimumTotal(new ArrayList<>());
    }
    public static int minimumTotal(List<List<Integer>> triangle) 
    {
        if(triangle.size() == 0) return -1;
        int n=triangle.size();
        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<triangle.get(i).size();j++)
            {
                int left=triangle.get(i+1).get(j);
                int right=triangle.get(i+1).get(j+1);
                // triangle.get(i).set(triangle.get(i).get(j),triangle.get(i).get(j)+Math.min(left,right));
                int updated=triangle.get(i).get(j)+Math.min(left,right);
                triangle.get(i).set(j,updated);
            }
        }
        return triangle.get(0).get(0);
    }
}