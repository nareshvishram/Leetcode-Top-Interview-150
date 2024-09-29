class Solution {
    String[] map;
    List<String> res;
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return new ArrayList<>();
        this.map=new String[10];
        map[2]="abc";
        map[3]="def";
        map[4]="ghi";
        map[5]="jkl";
        map[6]="mno";
        map[7]="pqrs";
        map[8]="tuv";
        map[9]="wxyz";
        res=new ArrayList<>();
        bt(digits,0,new StringBuilder());
        return res;
    }
    private void bt(String d,int idx,StringBuilder sb){
        if(idx==d.length()){
            res.add(sb.toString());
            return;
        }
        String s1=map[d.charAt(idx)-'0'];
        for(int i=0;i<s1.length();i++){
            bt(d,idx+1,sb.append(s1.charAt(i)));
            sb.deleteCharAt(sb.length()-1);
        }
    }
}