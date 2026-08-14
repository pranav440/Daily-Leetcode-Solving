class Solution {
    public int arrayPairSum(int[] nums) {
        int max = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int j = 1;
        int sum = 0;
        for(int i =0 ; i<nums.length; i=i+2){
           sum += Math.min(nums[i],nums[j]);
           j+=2;
        }
        return sum;
    }
}