class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) 
    {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];

        for(int i=0;i<m;i++)
        {
            if(i>=1 && obstacleGrid[i-1][0]==1)
            {
                break;
            }
            else if(obstacleGrid[i][0]==1)
            {
                break;
            }
            else{
                dp[i][0]=1;
            }
        }

        for(int i=0;i<n;i++)
        {
            if(i>=1 && obstacleGrid[0][i-1]==1)
            {
                break;
            }
            else if(obstacleGrid[0][i]==1)
            {
                break;
            }
            else{
                dp[0][i]=1;
            }
        } 

        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(obstacleGrid[i][j]==1)
                {
                    dp[i][j]=0;
                    continue;
                }
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
                
            }
            
        }
        return dp[m-1][n-1];     
    }
    // int solve(int i,int j,int m,int n,int[][] obstacleGrid)
    // {
    //     if(i>=m || i<0 || j>=n || j<0 || obstacleGrid[i][j]==1)
    //     {
    //         return 0;
    //     }
    //     if(i == m-1 && j==n-1)
    //     {
    //         return 1;
    //     }
    //     int down=solve(i+1,j,m,n,obstacleGrid);
    //     int right=solve(i,j+1,m,n,obstacleGrid);
    //     return down+right;
    // }
}