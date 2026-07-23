class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        int s = 0;
        int e = totalCol -1;

        while(s < totalRow && e >=0){
            if(matrix[s][e]==target){
                return true;
            }
            else if(matrix[s][e]<target){
                s++;
            }
            else{
                e--;
            }
        }
        return false;

    }
}