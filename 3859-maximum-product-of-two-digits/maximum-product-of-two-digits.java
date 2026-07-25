class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        int prevMax = 0;
        int num = n;
        while(num>0){
            int digit = num%10; 
            if(digit<max && digit>prevMax){
                prevMax = digit;
            }

            if(digit>=max){
                prevMax = max;
                max = digit;
            }
            
            num = num/10;

        }
        int ans = prevMax*max;
        return ans;
    }
}