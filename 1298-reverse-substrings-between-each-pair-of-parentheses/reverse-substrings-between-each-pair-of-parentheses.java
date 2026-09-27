class Solution {
    static String palindrome(String s){
        String reversed = new StringBuilder(s).reverse().toString();
        return reversed;
    }
    public String reverseParentheses(String s) {
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ')'){
                int end = i;
                for(int j=i-1; j>=0; j--){
                    if(s.charAt(j) == '('){
                        int start = j;
                        String word = palindrome(s.substring(start+1,end));
                        s = s.substring(0,j) + word + s.substring(end+1);
                        return reverseParentheses(s);
                        
                    }
                }

            }
        }
        return s;
    }
}