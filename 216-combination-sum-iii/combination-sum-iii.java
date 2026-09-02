class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] candidates = new int[10];
        for(int i=0 ; i<9 ; i++){
            candidates[i] = i+1;
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(candidates, n, ans, output, index,k); 
        return ans; 
        }
    

    static void solve(int[] candidates,int target,List<List<Integer>> ans,List<Integer> output,int index, int k ){
        if(target==0 && output.size()==k){
           if (output.contains(0)){
            return;
           }
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
        solve(candidates,target-candidates[index],ans,output,index+1,k);
        //backtrack kiya 
        output.remove(output.size()-1);
       
        //exclude ka call kiya
        solve(candidates,target,ans,output,index+1,k);
        
}
};