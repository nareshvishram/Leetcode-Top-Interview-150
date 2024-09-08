class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=Integer.MIN_VALUE,n=s.length(),i=0,j=0;
        if(s.trim().length()==0 && s.length()>0)
            return 1;
        if(n==0||n==1)
            return n;
        Map<Character,Integer> map=new HashMap<>();
        while(j<n){
            char c=s.charAt(j);
            if(map.containsKey(c))
                i=Math.max(i,map.get(c)+1);
            map.put(c,j);
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}