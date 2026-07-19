class Solution {
    static boolean isValid(int[] arr, int days, long mid){

    long weight = 0;
    int count = 1;

    for(int i = 0; i < arr.length; i++){

        if(weight + arr[i] <= mid){
            weight += arr[i];
        }else{
            count++;
            weight = arr[i];
        }

        if(count > days){
            return false;
        }
    }

    return true;
}

  public int shipWithinDays(int[] weights, int days) {

    long s = 0;
    long e = 0;

    for(int w : weights){
        s = Math.max(s, w);
        e += w;
    }

    long ans = e;

    while(s <= e){

        long mid = s + (e - s) / 2;

        if(isValid(weights, days, mid)){
            ans = mid;
            e = mid - 1;
        }else{
            s = mid + 1;
        }
    }

    return (int)ans;
  }
}
