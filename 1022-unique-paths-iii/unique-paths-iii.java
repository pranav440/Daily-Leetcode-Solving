class Solution {
    static boolean isvalid(int currentx,int currenty,int[][] grid,int rowlength,int columnlength,boolean[][] dupli,int total){
       if(currentx<0 || currentx>=rowlength || currenty<0 || currenty>=columnlength){
        return false;
       }
       if(dupli[currentx][currenty] == true){
        return false;
       }
       if(grid[currentx][currenty] == -1){
        return false;
       }

       return true;
    }
    static int solve(int startpointrow,int startpointcolumn,int[][]grid,int rowlength,int columnlength,boolean[][] dupli,int total,int count){
        int currentx = startpointrow;
        int currenty = startpointcolumn;
        dupli[currentx][currenty] = true;
        count++;
        int ans =0;
      //base case kya rahengi
      //ki jab humari current value jo hai woh final k equal ho jaye
      if(grid[currentx][currenty] == 2){

    if(count == total){
        dupli[currentx][currenty] = false;
        return 1;
    }

    dupli[currentx][currenty] = false;
    return 0;
}

      //for up
      if(isvalid(currentx-1,currenty,grid,rowlength,columnlength,dupli,total)){
        ans+=solve(currentx-1,currenty,grid, rowlength, columnlength, dupli,total,count);
      }

      //for down
      if(isvalid(currentx+1,currenty,grid,rowlength,columnlength,dupli,total)){
        ans+=solve(currentx+1,currenty,grid, rowlength, columnlength, dupli,total,count);
      }

      //for left
      if(isvalid(currentx,currenty-1,grid,rowlength,columnlength,dupli,total)){
        ans+=solve(currentx,currenty-1,grid, rowlength, columnlength, dupli,total,count);
      }

      //for right
      if(isvalid(currentx,currenty+1,grid,rowlength,columnlength,dupli,total)){
        ans+=solve(currentx,currenty+1,grid, rowlength, columnlength, dupli,total,count);
      }
     
     // agar kuch bhi nhi hua toh backtrac karo
     dupli[currentx][currenty] = false;

    return ans;
    }
    
    public int uniquePathsIII(int[][] grid) {
        int rowlength = grid.length;
        int columnlength = grid[0].length;
        int startpointrow =0;
        int startpointcolumn =0;
        int total =0;
        for(int i = 0; i<rowlength; i++){
            for(int j =0 ; j<columnlength; j++){
                if(grid[i][j] == 1){
                     startpointrow = i;
                     startpointcolumn = j;
                }
                if(grid[i][j]!=-1){
                    total++;
                }
            }
        }
        boolean[][] dupli = new boolean[rowlength][columnlength];
        for(int i=0; i<rowlength; i++){
            for(int j=0; j<columnlength; j++){
                dupli[i][j] = false;
            }
        }

        return solve(startpointrow,startpointcolumn,grid,rowlength,columnlength,dupli,total,0);
        
    }
}