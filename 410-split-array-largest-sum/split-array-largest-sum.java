class Solution {
     
      public boolean isValid(int[] nums, int k, int mid){
            int paintersCount =1;
            int PaintedLength = 0;
            for(int i=0 ; i<nums.length ; i++){
                if(PaintedLength+nums[i] <= mid){
                    PaintedLength+=nums[i];

                }
                else{
                    paintersCount++;
                    PaintedLength=0;
                    if(paintersCount>k || nums[i]>mid){
                        return false;
                    }
                    else{
                        PaintedLength+=nums[i];
                    }
                }
            }
            return true;
        }


    public int splitArray(int[] nums, int k) {

        int sum=0 ;
        for(int i =0; i<nums.length; i++){
            sum+=nums[i];
        }
        int s =0;
        int end = sum;
        int ans =0;
        while(s<=end){
            int mid = s+(end-s)/2;
            if(isValid(nums,k,mid)){
             ans = mid;
             end = mid-1;
            }
            else{
                s= mid+1;
            }
        }
        return ans;
    }
}