class Solution {
    List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper(0,0,new StringBuilder(""),n);
        return res;
    }
    private void helper(int close,int open,StringBuilder tmp,int n){
        if(tmp.length()==2*n){
            res.add(tmp.toString());
            return;
        }
        if(open<n){
            helper(close,open+1,tmp.append("("),n);
            tmp.delete(tmp.length()-1,tmp.length());
        }
        if(close<open){
            helper(close+1,open,tmp.append(")"),n);
            tmp.delete(tmp.length()-1,tmp.length());
        }
    }

    /**
        TLE Solution
     */
    // List<String> res;
    // StringBuilder sb;
    // public List<String> generateParenthesis(int n) {
    //     res=new ArrayList<>();
    //     sb=new StringBuilder();
    //     for(int i=0;i<n;i++){
    //         sb.append("()");
    //     }
    //     if(n==1)
    //         return Arrays.asList(sb.toString());
    //     bt(n,0,new StringBuilder(""));
    //     return res;
    // }
    // private void bt(int n,int idx,StringBuilder tmp){
    //     if(tmp.length()==2*n){
    //         if(isValid(tmp) && !res.contains(tmp.toString()))
    //             res.add(tmp.toString());
    //         return;
    //     }
    //     for(int i=0;i<n;i++){
    //         tmp.append(sb.charAt(i));
    //         bt(n,idx,tmp);
    //         tmp.delete(tmp.length()-1,tmp.length());
    //     }
    // }
    // private boolean isValid(StringBuilder sb){
    //     int i=0,j=sb.length()-1;
    //     Stack<Character> st=new Stack<>();
    //     while(true && i<sb.length()){
    //         if(sb.charAt(i)=='(')
    //             st.add(sb.charAt(i));
    //         else{
    //             if(st.isEmpty())
    //                 return false;
    //             st.pop();
    //         }
    //         i++;

    //     }
    //     return st.isEmpty();
    // }
}