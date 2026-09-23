class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character, Integer> keyboard = new HashMap<>();
        List<String> ans = new ArrayList<>();

    String row1 = "qwertyuiop";
    String row2 = "asdfghjkl";
    String row3 = "zxcvbnm";

    for (char c : row1.toCharArray()) {
    keyboard.put(c, 1);
    }

    for (char c : row2.toCharArray()) {
    keyboard.put(c, 2);
    }

    for (char c : row3.toCharArray()) {
    keyboard.put(c, 3);
    }

    for(String word : words){
      String lower = word.toLowerCase();
      int row = keyboard.get(lower.charAt(0));
      boolean valid = true;
      for(char c : lower.toCharArray()){
        if(keyboard.get(c) != row){
            valid = false;
            break;
        }
      }
      if(valid){
        ans.add(word);
      }
    }
    return ans.toArray(new String[0]);
        }
            }