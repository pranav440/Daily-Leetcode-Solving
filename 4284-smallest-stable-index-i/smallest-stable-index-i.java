class Solution {
    static int max(int i, int[] nums){
        int max = Integer.MIN_VALUE;
        for(int j=0; j<=i; j++){
            if(nums[j]>max){
                max = nums[j];
            }
        }
        return max;
    }

    static int min(int i, int[] nums){
        int min = Integer.MAX_VALUE;
        for(int j=i; j<nums.length; j++){
            if(nums[j]<min){
                min = nums[j];
            }
        }
        return min;
    }
    public int firstStableIndex(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        for(int i =0 ; i<nums.length; i++){
           int max =  max(i,nums);
            int min = min(i,nums);
            int StabilityScore = max-min;
            if(StabilityScore<=k){
                return i;
            }
        }
        return -1;
    }
}