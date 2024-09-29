class Solution {
    int mat[][];
    int ans;
    public int totalNQueens(int n) {
        mat=new int[n][n];
        ans=0;
        helper(n,0);
        return ans;
    }
    private void helper(int n,int row){
        if(row==n){
            ans++;
            return;
        }
        for(int col=0;col<n;col++){
            if(isValid(row,col,mat)){
                mat[row][col]=1;
                helper(n,row+1);
                mat[row][col]=0;
            }
        }
    }
    private boolean isValid(int i,int j,int mat[][]){
        if(i<0||j<0||i>=mat.length||j>=mat.length||mat[i][j]==1)
            return false;
        // check col
        for(int row=0;row<i;row++){
            if(mat[row][j]==1)
                return false;
        }
        // check row
        for(int col=0;col<mat.length;col++){
            if(mat[i][col]==1)
                return false;
        }
        // check diagonal
        int row=i,col=j;
        while(row>=0 && col>=0)
            if(mat[row--][col--]==1)
                return false;
        row=i;
        col=j;
        while(row>=0 && col<mat.length)
            if(mat[row--][col++]==1)
                return false;
        return true;

    }
}