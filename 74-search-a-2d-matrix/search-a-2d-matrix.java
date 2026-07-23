class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;
        int n = totalRows*totalCols;
        int s = 0;
        int e = n-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            int rowIndex = mid/totalCols;
            int ColIndex = mid%totalCols;
            if(matrix[rowIndex][ColIndex]==target){
                return true;
            }
            if(matrix[rowIndex][ColIndex]<target){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return false;
    }
}