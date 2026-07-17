class Solution {

     static boolean isValid(int [] arr, int k, int mid){
            int marblecount = 1;
            int lastpos = 0;
            for(int i = 1; i<arr.length ; i++){
                if(arr[i] - arr[lastpos] >= mid){
                    marblecount++;
                    lastpos=i;
                }
                
            }
            return marblecount>=k;
        }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int s =0;
        int e = position[n-1]-position[0];
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(isValid(position,m,mid)){
              ans = mid;
              s=mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return ans;
    }
}