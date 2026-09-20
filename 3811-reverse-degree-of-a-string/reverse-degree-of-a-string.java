class Solution {
    public int reverseDegree(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
           map.put(c, 26 - (c - 'a'));
        }

        int ans = 0;
        for(int i =0; i<s.length(); i++){
            int num = map.get(s.charAt(i));
            ans+= num * (i+1);
        }
         
        return ans;
    }
}