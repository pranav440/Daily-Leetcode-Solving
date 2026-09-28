class Solution {
    public int maxDepth(String s) {
        Deque<String> stack = new ArrayDeque<>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
              stack.push("(");
            }
            if(s.charAt(i) == ')'){
                int count1 = stack.size();
                if(count1>count){
                    count = count1;
                }
                stack.pop();
            }            
        }
        return count;
    }
}