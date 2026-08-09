class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                char num = board[i][j];

                if (!set.add("row" + i + "_" + num) ||
                    !set.add("col" + j + "_" + num) ||
                    !set.add("box" + i / 3 + "_" + j / 3 + "_" + num)) {

                    return false;
                }
            }
        }

        return true;
    }
}