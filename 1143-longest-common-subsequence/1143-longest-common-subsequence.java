class Solution {
    public int longestCommonSubsequence(String text1, String text2)
    {
        return generate2(text1,text2);
        
        
    }
    int generate2(String text1,String text2)
    {
        int[][] dp=new int[text1.length()+1][text2.length()+1];
        int max=0;
        for(int i=1;i<=text1.length();i++)
        {
            for(int j=1;j<=text2.length();j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
                max=Math.max(max,dp[i][j]);
            }
        }
        return max;
    }
    int generate(String text1,String text2,String cur,int index)
    {
        if(index==text1.length())
        {
           if(sequence(cur,text2))
           {
            return cur.length();
           }
            return 0;
        }
        int include=generate(text1,text2,cur+text1.charAt(index),index+1);
        
        int exclude=generate(text1,text2,cur,index+1);
        return Math.max(include,exclude);

    }
    boolean sequence(String cur,String text2)
    {
        int i=0;
        for(int j=0;j<text2.length() && i<cur.length();j++)
        {
            if(cur.charAt(i)==text2.charAt(j))
            {
                i++;
            }
        }
        return i==cur.length();
    }
}