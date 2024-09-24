class WordDictionary {
    TrieNode root;
    public WordDictionary() {
        this.root=new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode curr=root;
        for(char c:word.toCharArray()){
            if(curr.child[c-'a']==null)
                curr.child[c-'a']=new TrieNode();
            curr=curr.child[c-'a'];
        }
        curr.eow=true;
    }
    
    public boolean search(String word) {
        return helper(root,word,0);
    }
    private boolean helper(TrieNode curr,String word,int start){
        for(int i=start;i<word.length();i++){
            if(word.charAt(i)=='.'){
                // check for all the existing indices
                for(int j=0;j<26;j++){
                    if(curr.child[j]!=null){
                        boolean ret=helper(curr.child[j],word,i+1);
                        if(ret)
                            return true;
                    }
                }
                //no non null element found
                return false;
            }else{
                if(curr.child[word.charAt(i)-'a']==null)
                    return false;
                curr=curr.child[word.charAt(i)-'a'];
            }
        }
        return curr.eow;
    }
}
class TrieNode{
    TrieNode child[];
    boolean eow;
    TrieNode(){
        this.child=new TrieNode[26];
        this.eow=false;
    }

}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */