class Solution {
    static boolean istrue(char s){
        if(s == 'a' || s == 'e'|| s == 'i'|| s == 'o' || s == 'u' || s == 'A' || s == 'E'|| s == 'I'||s == 'O' ||s == 'U' ){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while(start<=end){
            if(istrue(s.charAt(start)) && istrue(s.charAt(end))){
                char temp = sb.charAt(start);
                sb.setCharAt(start, sb.charAt(end));
                sb.setCharAt(end, temp);
                 start++;
                 end--;
            }
            else{
                if(!istrue(s.charAt(end))){
                    end--;
                }
                else if(!istrue(s.charAt(start))){
                     start++;
                }
                else{
                    start++;
                    end--;
                }
            } 
           
        }
        return sb.toString();
    }
}