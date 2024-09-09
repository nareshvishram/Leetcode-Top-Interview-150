class Solution {
    public int romanToInt(String s) {
        Map<String,Integer> map=new HashMap<>();
        map.put("",0);
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int res=0;
        int i=0,j=1;
        while(j<s.length())
        {
            String s1=s.charAt(i)+"";
            String s2=s.charAt(j)+"";
            if(map.get(s1)>=map.get(s2))
                res+=map.get(s1);
            else
                res-=map.get(s1);
            i++;
            j++;
        }
        return res+map.get(s.charAt(s.length()-1)+"");
        
    }
}