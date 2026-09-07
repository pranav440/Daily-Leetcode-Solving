class Solution {

    static boolean solve(int x, int y, char[][] board, boolean[][] check,
                         String word, int i) {

        // All characters matched
        if (i == word.length()) {
            return true;
        }

        // Out of bounds
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) {
            return false;
        }

        // Already visited
        if (check[x][y]) {
            return false;
        }

        // Character doesn't match
        if (board[x][y] != word.charAt(i)) {
            return false;
        }

        // Mark current cell
        check[x][y] = true;

        // Up
        if (solve(x - 1, y, board, check, word, i + 1)) {
            return true;
        }

        // Down
        if (solve(x + 1, y, board, check, word, i + 1)) {
            return true;
        }

        // Left
        if (solve(x, y - 1, board, check, word, i + 1)) {
            return true;
        }

        // Right
        if (solve(x, y + 1, board, check, word, i + 1)) {
            return true;
        }

        // Backtrack
        check[x][y] = false;

        return false;
    }

    public boolean exist(char[][] board, String word) {

        int rows = board.length;
        int cols = board[0].length;

        boolean[][] check = new boolean[rows][cols];

        // Word can start from ANY cell
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (solve(i, j, board, check, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }
}