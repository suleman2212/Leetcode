/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) 
    {
        ArrayList<Integer> al=new ArrayList<>();
        ListNode cur=head;
        ListNode prev=null;
        ListNode nextt=cur.next;
        int index=0;
        while(cur.next!=null)
        {
            if(prev!=null)
            {
                if(prev.val>cur.val && nextt.val>cur.val)
                {
                    al.add(index);
                }else if(prev.val<cur.val && nextt.val<cur.val)
                {
                    al.add(index);
                }
            }
            prev=cur;
            cur=nextt;
            nextt=cur.next;
            index++;
            
        }
        if(al.size()<=1)
        {
            return new int[]{-1,-1};
        }
        int minDistance=Integer.MAX_VALUE;
        int maxDistance=-1;
        for(int i=1;i<al.size();i++)
        {
           int dis = al.get(i)-al.get(i-1);
           if(dis<minDistance)
           {
            minDistance=dis;
           }
        }
        maxDistance=al.get(al.size()-1)-al.get(0);
        return new int[]{minDistance,maxDistance};

        
        

        
    }
}