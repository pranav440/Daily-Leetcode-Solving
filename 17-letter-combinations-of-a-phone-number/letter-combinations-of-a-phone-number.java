class Solution {
    static void solve(String digits,HashMap<Integer, String> map,List<String> ans,StringBuilder output,int index){
        //base case
        if(index == digits.length()){
            ans.add(output.toString());
            return;
        }
        char ch = digits.charAt(index);
        String val = map.get(ch - '0');
        for (int i = 0; i < val.length(); i++) {
        output.append(val.charAt(i));
        solve(digits, map, ans, output, index + 1);
        output.deleteCharAt(output.length() - 1);
    }
    }
    public List<String> letterCombinations(String digits) {
       HashMap<Integer, String> map = new HashMap<>();
       map.put(2, "abc");
       map.put(3, "def");
       map.put(4, "ghi");
       map.put(5, "jkl");
       map.put(6, "mno");
       map.put(7, "pqrs");
       map.put(8, "tuv");
       map.put(9, "wxyz");
       List<String> ans = new ArrayList<>();
       StringBuilder output = new StringBuilder();
       solve(digits,map,ans,output,0);
       return ans;
    }
}