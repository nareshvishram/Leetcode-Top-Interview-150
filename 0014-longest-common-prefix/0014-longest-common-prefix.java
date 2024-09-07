class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String curr=strs[0];
        for(int i=curr.length();i>=0;i--){
            String tmp=curr.substring(0,i);
            System.out.println(tmp);
            boolean flag=false;
            for(int j=0;j<strs.length;j++){

                if(!isMatch(tmp,strs[j])){
                    flag=true;
                    break;
                }
            }
            if(!flag)
                return tmp;
        }
        return "";
    }
    private boolean isMatch(String s1,String s2){
        System.out.println(s1+" "+s2);
        if(s1.length()>s2.length())
                return false;
        for(int i=0;i<s1.length() && i<s2.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))
                return false;
            
        }
        return true;
    }
}