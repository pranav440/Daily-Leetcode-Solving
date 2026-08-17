class Solution {

    public List<List<String>> partition(String s) {

        List<List<String>> result = new ArrayList<>();
        List<String> current = new ArrayList<>();

        solve(s, 0, result, current);

        return result;
    }

    static void solve(String s, int index,
                      List<List<String>> result,
                      List<String> current) {

        // We have reached the end
        if (index == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Try every possible substring starting from index
        for (int i = index; i < s.length(); i++) {

            String part = s.substring(index, i + 1);

            // Only choose palindrome parts
            if (check(part)) {

                current.add(part);

                solve(s, i + 1, result, current);

                // Backtracking
                current.remove(current.size() - 1);
            }
        }
    }

    static boolean check(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}