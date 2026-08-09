class Solution {
    public int numTilePossibilities(String tiles) {

        int[] freq = new int[26];

        // Store frequency of each character
        for (char c : tiles.toCharArray()) {
            freq[c - 'A']++;
        }

        return count(freq);
    }

    private int count(int[] freq) {

        int total = 0;

        // Try every possible character
        for (int i = 0; i < 26; i++) {

            // If this character is available
            if (freq[i] > 0) {

                // CHOOSE
                freq[i]--;

                // The sequence created by choosing this
                // character is one valid sequence
                total++;

                // Try adding more characters
                total += count(freq);

                // BACKTRACK / UNDO
                freq[i]++;
            }
        }

        return total;
    }
}