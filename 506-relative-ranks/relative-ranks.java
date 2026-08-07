import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;

        // Store indices
        Integer[] index = new Integer[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        // Sort indices based on scores in descending order
        Arrays.sort(index, (a, b) -> score[b] - score[a]);

        String[] ans = new String[n];

        // Assign ranks
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ans[index[i]] = "Gold Medal";
            } else if (i == 1) {
                ans[index[i]] = "Silver Medal";
            } else if (i == 2) {
                ans[index[i]] = "Bronze Medal";
            } else {
                ans[index[i]] = String.valueOf(i + 1);
            }
        }

        return ans;
    }
}