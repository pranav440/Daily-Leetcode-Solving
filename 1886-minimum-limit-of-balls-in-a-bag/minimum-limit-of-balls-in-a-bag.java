class Solution {
    static boolean isValid(int[] nums, int mid , int maxOperations){
            int operations = 0;
            for(int num : nums){
                operations+=(num-1)/mid;
                if(operations>maxOperations){
                    return false;
                }
            }
            return true;
    }

    public int minimumSize(int[] nums, int maxOperations) {
        Arrays.sort(nums);
        int s = 1;
        int e = nums[nums.length-1];
        int ans = e;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(isValid(nums,mid,maxOperations)){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
}