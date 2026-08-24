class Solution {
    public boolean isAnagram(String s, String t) {
        boolean ans = false;
        StringBuilder st = new StringBuilder(t);
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            char target = s.charAt(i);
            int index = st.indexOf(String.valueOf(target));
            if(st.toString().contains(String.valueOf(target))){
                st.deleteCharAt(index);
                ans = true;
            }
            if(index==-1){
                return false;
            }
        }
        return ans;
    }
}