class Solution {
    public boolean sumGame(String num) 
    {
        int leftSum=0;
        int rightSum=0;
        
        int leftQ=0;
        int rightQ=0;
        
        int n=num.length();
        int mid=n/2;

        //left side
        for(int i=0;i<mid;i++)
        {
            if(num.charAt(i)=='?')
            {
                leftQ++;
                continue;
            }
            leftSum+=num.charAt(i)-'0';
        }

        //right side
        for(int i=mid;i<n;i++)
        {
            if(num.charAt(i)=='?')
            {
                rightQ++;
                continue;
            }
            rightSum+=num.charAt(i)-'0';
        }
        
        int totalQ=leftQ+rightQ;
        if(totalQ%2!=0)
        {
            return true;//alice win
        }
        if(leftSum==rightSum && leftQ==rightQ)
        {
            return false;//bob win
        }

        if(leftQ>rightQ)
        {
            int q=leftQ-rightQ;
            leftSum +=9 * (q)/2;
            if(leftSum==rightSum)
            {
                return false;
            }
        }else
        {
            int q=rightQ-leftQ;
            rightSum +=9 * (q)/2;
            if(leftSum==rightSum)
            {
                return false;
            }
        }
        return true;
        
    }

}