class Solution {
    public boolean canAliceWin(int n) {
        int count=10;
        while(n>=count)
        {
            n-=count;
            count--;
        }
        return count%2==0 ? false : true;        
    }
}