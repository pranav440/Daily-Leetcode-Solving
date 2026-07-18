class Solution {
    static boolean isValid(int [] arr, int h, long mid){
        long hrs = 0;
        long sum =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=mid){
               hrs++;
            }
            else{
                long add= arr[i]/mid ;
                if(arr[i]%mid>0){
                    add++;
                }
                hrs+=add;
            }
            if(hrs>h){
                return false;
            }
        }
        return true;

    }
    public int minEatingSpeed(int[] piles, int h) {
     Arrays.sort(piles);
     long length = piles.length;
     long s =1;
     long e = 1000000000; 
     long ans =-1;
     while(s<=e){
        long mid = s+(e-s)/2;
        if(isValid(piles,h,mid)){
             ans = mid;
             e = mid-1;
        }
        else{
            s =mid+1;
        }
     }
      return (int)ans;
    }
}