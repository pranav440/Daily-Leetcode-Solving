class Solution {
    static int solve(int[] nums, int ans){
        for(int i=0; i<nums.length; i++){
            int digit = nums[i];
            int sum = 0;
            while(digit>0){
                int num = digit%10;
                sum+=num;
                digit = digit/10;
            }
            if(sum == i && sum<ans){
                ans = sum;
            }
        }
        return ans;
    }
    public int smallestIndex(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int ans1 = solve(nums,ans);
        if(ans1 != ans){
            return ans1;
        }
        return -1;
    }
}