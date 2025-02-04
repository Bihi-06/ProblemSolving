class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++){
                char num = board[i][j];
                if (num != '.') {
                    String rowKey = num + " in row " + i;
                    String colkey = num + " in col " + j;
                    String boxKey = num + " in box " + (i/3) + "-" + (j/3);

                    if (!seen.add(rowKey) || !seen.add(colkey) || !seen.add(boxKey)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
