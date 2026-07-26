class Solution {
    public int compress(char[] chars) {
        int readIndex =0;
        int writeIndex = 0;
        while(readIndex<chars.length){
            char ch = chars[readIndex];
            int count =0;
            while(readIndex<chars.length && ch == chars[readIndex]){
                readIndex++;
                count++;
            }
            chars[writeIndex] = ch;
            writeIndex++;
            if(count>1){
                String s = String.valueOf(count);
                for(char c : s.toCharArray()){
                  chars[writeIndex] = c;
                  writeIndex++;
                }
            }

        }
        return writeIndex;
    }
}