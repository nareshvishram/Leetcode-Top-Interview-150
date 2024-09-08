class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0,n=t.length(),m=s.length();
        if(n<m)
            return false;
        if(m==0)
            return true;
        while(i<m && j<n){
            if(s.charAt(i)==t.charAt(j)){
                i++;j++;
                if(i==m)
                    return true;
            }else{
                j++;
            }
        }
        return false;
    }
}