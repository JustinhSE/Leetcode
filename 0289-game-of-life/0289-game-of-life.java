class Solution {
    public void gameOfLife(int[][] board) {
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}, {1,1}, {1,-1}, {-1,1}, {-1,-1}};
        List<int[]> deadCells = new ArrayList<>();
        List<int[]> liveCells = new ArrayList<>();

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                int count = 0;

                for (int[] dir : directions) {
                    int newR = r + dir[0];
                    int newC = c + dir[1];
                    if (isBound(newR, newC, board)) {
                        count += board[newR][newC];
                    }
                }

                if (board[r][c] == 1) {
                    if (count < 2 || count > 3) {
                        deadCells.add(new int[]{r, c});
                    }
                } else {
                    if (count == 3) {
                        liveCells.add(new int[]{r, c});
                    }
                }
            }
        }

        for (int[] cell : deadCells) {
            board[cell[0]][cell[1]] = 0;
        }
        for (int[] cell : liveCells) {
            board[cell[0]][cell[1]] = 1;
        }
    }

    private boolean isBound(int r, int c, int[][] board) {
        return 0 <= r && r < board.length && 0 <= c && c < board[0].length;
    }
}