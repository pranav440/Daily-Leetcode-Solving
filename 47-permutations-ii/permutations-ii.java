class Solution {
    static void solve(List<Integer> output, List<List<Integer>> ans, List<Integer> duplicate){
        // base case hai yeh
        if(duplicate.size() == 0 && !ans.contains(output)){
            ans.add(new ArrayList(output));
            return;
        }
        
        //har position pe mei try karunga daalke
        for(int i=0; i<duplicate.size(); i++){
            //duplicate skip karne ko 
            int num = duplicate.get(i);
            duplicate.remove(i);
            output.add(num);
            solve(output,ans,duplicate);
            //backtrack kon karenga , tera dost ??
            output.remove(output.size()-1);
            duplicate.add(i,num);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        List<Integer> duplicate = new ArrayList<>();
        for (int n : nums) duplicate.add(n);

        solve(output,ans,duplicate);
        return ans;
    }
}