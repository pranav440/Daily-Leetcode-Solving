class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);
            char first = Character.toLowerCase(word.charAt(0));

            if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
                word.append("ma");
            } else {
                char original = word.charAt(0);
                word.deleteCharAt(0);
                word.append(original).append("ma");
            }

            for (int j = 0; j <= i; j++) {
                word.append('a');
            }

            if (i > 0) result.append(' ');
            result.append(word);
        }

        return result.toString();
    }
}