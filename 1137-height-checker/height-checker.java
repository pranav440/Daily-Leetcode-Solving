class Solution {
    public int heightChecker(int[] heights) {
        int length = heights.length;
        int arr[] = new int[length];
        for(int i = 0; i<heights.length; i++){
            arr[i] = heights[i];
        }
        Arrays.sort(heights);
        int count = 0;
        for(int i=0; i<heights.length; i++){
            if(heights[i]!=arr[i]){
                count++;
            }
        }
        return count;

    }
}