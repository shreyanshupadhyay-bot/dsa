
class Solution {
    public List<List<String>> solveNQueens(int n) {
        Set<Integer> col = new HashSet<>();
        Set<Integer> diag1 = new HashSet<>();
        Set<Integer> diag2= new HashSet<>();
        List<List<String>> ans=new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i =0;i<n;i++){
            for(int  j =0;j<n;j++){
                board[i][j]='.';
            }
        }
        gen(0,ans,board,col,diag1,diag2);
        return ans;

    }
    void gen(int row,List<List<String>> ans,char[][] board,Set<Integer> col,Set<Integer> diag1,Set<Integer> diag2){
        if(row==board.length){
             List<String> curr = new ArrayList<>();   
            for(int i=0;i<board.length;i++){
                curr.add(new String(board[i]));       
                }
                ans.add(curr);
                return;    
        }
        for(int c=0;c<board.length;c++){
            if((col.contains(c))||(diag1.contains(row-c))||(diag2.contains(row+c))){
                continue;
            }
            board[row][c]='Q';
            col.add(c);
            diag1.add(row-c);
            diag2.add(row+c);
            gen(row+1,ans,board,col,diag1,diag2);
            board[row][c]='.';
            col.remove(c);
            diag1.remove(row-c);
            diag2.remove(row+c);
        }

    }
}