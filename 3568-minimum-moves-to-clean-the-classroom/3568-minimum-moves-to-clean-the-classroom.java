class Solution 
{
    class State
    {
        int row, col, remEnergy, mask, dist;
        State(int row, int col, int remEnergy, int mask, int dist)
        {
            this.row=row;
            this.col=col;
            this.remEnergy=remEnergy;
            this.mask=mask;
            this.dist=dist;
        }
    }
    public int minMoves(String[] classroom, int energy) 
    {
        //start index
        int start=0;
        int end=0;

        //row & Column
        int m=classroom.length;
        int n=classroom[0].length();

        //Litter index
        int[][] id=new int[m][n];

        //Litter Count
        int k=0;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                char tile=classroom[i].charAt(j);
                if(tile=='S')
                {
                    start=i;
                    end=j;
                }else if(tile=='L')
                {
                    id[i][j]=k;
                    k++;
                }

            }
        }
        //how many Litter which represends the location
        int maskAll=(1<<k)-1;
        if(k==0)
        {
            return 0;
        }

        Queue<State> q=new LinkedList<>();
        q.offer(new State(start,end,energy,0,0));
        //for not visiting again it prevents visit to the same tiles
        boolean[][][][] visited=new boolean[m][n][energy+1][1<<k];
        visited[start][end][energy][0]=true;

        //direction
        //up and down
        int[] dr={-1,1,0,0};
        //right and left
        int[] dc={0,0,1,-1};
        while(!q.isEmpty())
        {
            State cur=q.poll();
            
            for(int d=0;d<4;d++)
            {
                int nr=cur.row + dr[d];
                int nc=cur.col + dc[d];
                
                if(nr<0 || nr>=m || nc<0 || nc>=n)
                {
                    continue;
                }
                if(classroom[nr].charAt(nc)=='X')
                {
                    continue;
                }

                int ne=cur.remEnergy-1;
                if(ne<0)
                {
                    continue;
                }
                int nmask=cur.mask;
                if(classroom[nr].charAt(nc)=='L')
                {
                    int litterNum=id[nr][nc];
                    nmask=nmask | (1<<litterNum);
                }
                int ndist=cur.dist+1;
                if(nmask==maskAll)
                {
                    return ndist;
                }
                
                if(classroom[nr].charAt(nc)=='R')
                {
                    ne=energy;
                }
                if(ne==0)
                {
                    continue;
                }
                if(!visited[nr][nc][ne][nmask])
                {
                    visited[nr][nc][ne][nmask]=true;
                    q.offer(new State(nr,nc,ne,nmask,ndist));
                }

            }
        }
        return -1;

    }
}