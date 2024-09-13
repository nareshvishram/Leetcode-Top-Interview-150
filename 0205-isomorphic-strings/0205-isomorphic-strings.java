class Solution {
    public boolean isIsomorphic(String s, String t) {
        int map1[]=new int[200];
        int map2[]=new int[200];
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i),b=t.charAt(i);

            if(map1[a]!=map2[b])
                return false;
            map1[a]=i+1;
            map2[b]=i+1;
        }
        return true;
    }
}