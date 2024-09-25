class Solution {
    int m,n;
    boolean visited[][];
    public boolean exist(char[][] board, String word) {
        m=board.length;
        n=board[0].length;
        visited=new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(word.charAt(0)==board[i][j] && !visited[i][j]){
                    if(search(board,word,i,j,0))
                        return true;
                }
            }
        }
        return false;
    }
    private boolean search(char[][] board,String word,int i,int j,int idx){
        if(idx==word.length())
            return true;
        if(i<0||j<0||i>=m||j>=n||idx>=word.length()||visited[i][j]||board[i][j]!=word.charAt(idx))
            return false;
        visited[i][j]=true;
        if(search(board,word,i+1,j,idx+1)||search(board,word,i-1,j,idx+1)||search(board,word,i,j+1,idx+1)
        ||search(board,word,i,j-1,idx+1))
            return true;
        visited[i][j]=false;
        return false;
    }
}