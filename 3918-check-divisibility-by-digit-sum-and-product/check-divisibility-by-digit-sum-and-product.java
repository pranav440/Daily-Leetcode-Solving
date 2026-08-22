class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int digit1 =0;
        int digit2 =1;
        while(num>0){
            int digit = num%10;
            digit1 = digit1 + digit; 
            digit2 = digit2*digit;
            num = num/10;
        }
        int sum = digit1+digit2;
        if(n%sum == 0){
            return true;
        }
       
        return false;
        
    }
}