class Solution {
    public boolean isMonotonic(int[] nums) {
        int j1 = 1;
        int j2 = 1;
        int count1 = 0;
        int count2 = 0;
        if(nums.length<=1){
                return true;
            }
            
        for(int i =0; i<nums.length-1; i++){
            
            if( nums[i]<=nums[j1]){
                count1++;
                j1++;
            }
            if(nums[i]>=nums[j2]){
                count2++;
                j2++;
            }
            if(count1==nums.length-1 || count2==nums.length-1){
                return true;
            }

        }
        return false;
    }
}