import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];

        // Count frequency of each character
        for (int i = 0; i < word.length(); i++) {
            arr[word.charAt(i) - 'a']++;
        }

        // Sort frequencies
        Arrays.sort(arr);

        int count = 0;
        int limit = 1;
        int used = 0;

        // Traverse from highest frequency to lowest
        for (int i = 25; i >= 0; i--) {
            if (arr[i] == 0)
                continue;

            count += arr[i] * limit;
            used++;

            if (used % 8 == 0) {
                limit++;
            }
        }

        return count;
    }
}