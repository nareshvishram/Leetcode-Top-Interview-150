class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        int n=s.length();
        String tmp[]=s.split("\\s+");
        int i=0,j=tmp.length-1;
        while(i<j){
            String t=tmp[i];
            tmp[i]=tmp[j];
            tmp[j]=t;
            i++;
            j--;
        }
        return String.join(" ",tmp);

    }
}