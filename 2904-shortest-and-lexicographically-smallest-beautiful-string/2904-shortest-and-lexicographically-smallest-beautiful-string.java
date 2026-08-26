class Solution {
    public String shortestBeautifulSubstring(String s, int k) 
    {
        String subString="";
        int count=0;
        int left=-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                if(left==-1)
                {
                    left=i;
                }
                count++;
            }
            if(count==k)
            {
                String current=s.substring(left,i+1);
                System.out.println(current.length());
                if(subString.length()==0 || current.length()<subString.length())
                {
                    subString=s.substring(left,i+1);
                }else{
                    int index=0;
                    while(index<current.length() && current.length()==subString.length())
                    {
                        if(current.charAt(index)<subString.charAt(index))
                        {
                            subString=s.substring(left,i+1);
                            break;
                        }else if(current.charAt(index)>subString.charAt(index))
                        {
                            
                            break;
                        }else{
                            index++;
                        }
                    }
                }
                left++;
                while(left<i && s.charAt(left)!='1')
                {
                    left++;
                }
                count--;
            }


        }   
        return subString;     
    }
}