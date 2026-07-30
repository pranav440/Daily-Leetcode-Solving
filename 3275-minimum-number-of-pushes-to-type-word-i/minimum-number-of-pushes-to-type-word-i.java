class Solution {
    public int minimumPushes(String word) {
     int length =word.length();
     int count = 8;
    
    if(word.length()<=8){
       return length;
    }
    if(word.length()>8 && word.length()<=16){
        return count+=(length-8)*2;
    }
    if(word.length()>16 && word.length()<=24){
        return  24 + (length - 16)*3;
    }
    else{
        return 48 + (length-24)*4;
    }
    

    }
   
}