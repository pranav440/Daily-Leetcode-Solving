class Solution {
    public List<String> generateParenthesis(int n) {
        int open =0;
        int close = 0;
        List<String> st = new ArrayList<>();
        backtracking(open,close,"",st,n);
        return st;
    }
    static void backtracking(int open, int close,String current, List<String> st, int n){
        if(current.length() == 2*n){
            st.add(current);
            return;
        }
        //yeh wala add karo (
        if(open<n){
            backtracking(open+1,close,current + "(",st,n);
        }
        //yeh wala add karo )
        if(close<open){
            backtracking(open,close+1,current + ")",st,n);
        }
    }
}