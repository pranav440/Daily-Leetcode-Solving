class Solution {
    static void solve(int[] candidates,int target,List<List<Integer>> ans,List<Integer> output,int index){
        if(target==0){
            ans.add(new ArrayList(output));
            return;
        }
        if(index == candidates.length){
            return;
        }
        if(target<0){
           return;
        }

        // sabse pehele include ka call karunga
        
        output.add(candidates[index]);
        solve(candidates,target-candidates[index],ans,output,index+1);
        //backtrack kiya 
        output.remove(output.size()-1);
        while(index+1<candidates.length && candidates[index]==candidates[index+1]){
            index++;
        }
        //exclude ka call kiya
        solve(candidates,target,ans,output,index+1);
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        Arrays.sort(candidates);
        solve(candidates, target, ans, output, index);
        return ans;
    }
}