class Solution {
    static boolean istrue(String word){
        int start =1;
        int end = word.length()-1;
        for (int i = start; i <= end; i++) {
           char ch = word.charAt(i);
            if (ch != Character.toLowerCase(ch)) {
                return false;
            } 
        }
        return true;
    }

    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())){
            return true;
        }
        if(word.equals(word.toLowerCase())){
            return true;
        }
        char ch = word.charAt(0);
        if(ch != Character.toLowerCase(ch) && istrue(word)){
            return true;
        }
        

     return false;
    }
}