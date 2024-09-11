class Solution {
    public void solve(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if((i==0||j==0||i==board.length-1||j==board[0].length-1) && board[i][j]=='O'){
                    dfs(i,j,board,'P');
                }
            }
        }
        // for(char c[]:board)
        //     System.out.println(Arrays.toString(c));
        // for(int i=0;i<board.length;i++){
        //     for(int j=0;j<board[0].length;j++){
        //         if(board[i][j]=='O'){
        //             dfs(i,j,board,'X');
        //         }
        //     }
        // }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='P'){
                    board[i][j]='O';
                }else if(board[i][j]=='O')
                    board[i][j]='X';
            }
        }
    }
    private void dfs(int i,int j, char[][] board,char c){
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]=='P'||board[i][j]=='X')
            return ;
        board[i][j]='P';
        dfs(i+1,j,board,c);
        dfs(i-1,j,board,c);
        dfs(i,j+1,board,c);
        dfs(i,j-1,board,c);
    }
}