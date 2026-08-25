class Solution {

    static boolean check(int num , int[] nums){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == num){
                return true;
            }
        }
        return false;
    }

    public int missingMultiple(int[] nums, int k) {
        int target = k;

        while (check(target, nums)) {
            target += k;
        }

        return target;
    }
    
    
    

}