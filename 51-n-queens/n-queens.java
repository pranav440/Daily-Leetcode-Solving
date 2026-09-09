class Solution {
    static boolean isValid(int rowIndex, int colindex,char[][] board,int n ){
        int rowindex = rowIndex;
        int colIndex = colindex;
        while(colIndex>=0){
            if(board[rowindex][colIndex] == 'Q'){
                return false;
            }
            colIndex--;
        }
         rowindex = rowIndex;
         colIndex = colindex;
        while(rowindex >=0 && colIndex>=0){
            if(board[rowindex][colIndex] == 'Q'){
                return false;
            }
            rowindex--;
            colIndex--;
        }
        rowindex = rowIndex;
        colIndex = colindex;
        while(rowindex<n && colIndex>=0){
            if(board[rowindex][colIndex] == 'Q'){
                return false;
            }
            rowindex++;
            colIndex--;
        }
        return true;
    }
    static void solve(char[][] board, List<List<String>> ans, int n , int colindex){
        //base case
        //agar apna jo colindex hai woh limit k bahar gaya matlab apne ko ans milgaya
        if(colindex>=n){
        List<String> temp = new ArrayList<>();
        for(int i =0 ; i<n; i++){
            temp.add(new String(board[i]));
        }
        ans.add(temp);
        return;
        }

        //abhi ek case mei solve then baaki recursion dekhenga  apne ko kya

        for(int i=0; i<n ; i++){
            if(isValid(i,colindex,board,n)){
                board[i][colindex] = 'Q';
                solve(board,ans,n,colindex+1);
                //backtrack bhi karo
                board[i][colindex] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0; i<n; i++){
            Arrays.fill(board[i],'.');
        }
        List<List<String>> ans = new ArrayList<>();
        solve(board,ans,n,0);
        return ans;
    }
}