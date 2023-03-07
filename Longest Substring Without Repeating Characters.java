class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0,result=0;
        Map<Character,Integer> map=  new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                start = Math.max(start,map.get(s.charAt(i))+1);
            }
            result =  Math.max(result,i-start+1);
            map.put(s.charAt(i),i);
        } 
        return result;
    }
}