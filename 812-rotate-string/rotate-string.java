class Solution {
    public boolean rotateString(String s, String goal) {
        int index = 0;
        if(s.length()!=goal.length()) return false;
        boolean ans = false;
        for(int i =0 ; i<=s.length()-1; i++){
            if(s.charAt(i) == goal.charAt(0)){
                index = i;
                int j = index;
                ans = true;
                for(int z = 0; z<goal.length(); z++){
                    if(j > s.length()-1){
                        j=0;
                    }
                    if(s.charAt(j) != goal.charAt(z)){
                        ans = false;
                        break;
                    }
                    j++;
                }
                if(ans) return ans;
            }
        }
        return ans;
    }
}