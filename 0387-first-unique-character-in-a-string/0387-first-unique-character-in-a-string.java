class Solution {
    public int firstUniqChar(String str) {
      
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
                continue;
            }
            map.put(ch,1);
        }
        for(int i=0;i<str.length();i++)
        {
            if(map.get(str.charAt(i))==1)
            {
                return i;
            }
        }
     

        return -1;
    }
}