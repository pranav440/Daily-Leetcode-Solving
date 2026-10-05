class Solution {
    static boolean check(String S, int s, int e){
            while(s<=e){
                if(S.charAt(s)==S.charAt(e)){
                    s++;
                    e--;
                }
                else{
                    return false;
                }
            }
            return true;
    }
    
    public boolean validPalindrome(String s) {
        int start =0 ;
        int end = s.length()-1;
        boolean ans = true;
        int count =0;
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
               ans = true;
               start++;
               end--;
            }
            else{
              if(check(s,start+1,end)){
                return true;
                }

            else if(check(s,start,end-1)){
                return true;
            }
            else{
               return false;
            }
              }
           

        }
         return ans;
    }
}
    
