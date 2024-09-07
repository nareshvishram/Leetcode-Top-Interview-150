class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE,idx=0;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min){
                min=strs[i].length();
                idx=i;
            }
        }
        System.out.println(idx+" "+min);
        for(int i=strs[idx].length();i>=0;i--){
            String curr=strs[idx].substring(0,i);
            boolean flag=false;
            for(int j=0;j<strs.length;j++){
                if(!isMatch(curr,strs[j])){
                    flag=true;
                    break;
                }
            }
            if(!flag)
                return curr;
        }
        return "";
    }
    private boolean isMatch(String s1,String s2){
        for(int i=0;i<s1.length() && i<s2.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))
                return false;
            
        }
        return true;
    }
}