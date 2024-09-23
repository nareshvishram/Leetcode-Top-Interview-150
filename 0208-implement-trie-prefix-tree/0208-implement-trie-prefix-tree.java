class Trie {
    
    TrieNode root;
    public Trie() {
        this.root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr=root;
        for(char c:word.toCharArray()){
            if(curr.child[c-'a']==null)
                curr.child[c-'a']=new TrieNode();
            curr=curr.child[c-'a'];
        }
        curr.eod=true;
    }
    
    public boolean search(String word) {
        TrieNode curr=root;
        for(char c:word.toCharArray()){
            if(curr.child[c-'a']==null)
                return false;
            curr=curr.child[c-'a'];
        }
        if(curr.eod)
            return true;
        return false;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr=root;
        for(char c:prefix.toCharArray()){
            if(curr.child[c-'a']==null)
                return false;
            curr=curr.child[c-'a'];
        }
        return true;
    }
}
class TrieNode{
    boolean eod;
    TrieNode child[];
    TrieNode(){
        this.eod=false;
        this.child=new TrieNode[26];
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */