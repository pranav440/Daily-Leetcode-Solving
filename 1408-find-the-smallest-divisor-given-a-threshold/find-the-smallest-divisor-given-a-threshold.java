class Solution {
    static boolean isValid(int[] nums, int threshold, int mid){
        int sum =0;
        for(int i=0; i<nums.length ; i++){
            sum+=Math.ceilDiv(nums[i],mid);
        }
        return sum <= threshold;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int s = 1;
        int e = nums[nums.length-1];
        int ans = -1;

        while(s<=e){
            int mid = s + (e-s)/2;
            if(isValid(nums,threshold,mid)){
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