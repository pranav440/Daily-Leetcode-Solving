class Solution {
    public String smallestPalindrome(String s) {
        int length = s.length();
        int mid = s.length()/2;
        char[] chars = s.toCharArray();
        Arrays.sort(chars,0,mid);
        
        if(length%2!=0){
            int j=mid-1;
        for(int i=mid+1; i<s.length(); i++){
            chars[i] = chars[j];
            j--;
        }
        }
        else{
            int j=mid-1;
            for(int i=mid; i<s.length(); i++){
            chars[i] = chars[j];
            j--;
        }
        }
        return String.valueOf(chars);
        }
    }
