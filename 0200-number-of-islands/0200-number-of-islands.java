class Solution {
    public int numIslands(char[][] grid) {
        int numIslands = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    numIslands++;
                }
            }
        }
        return numIslands;
    }

    public void dfs(char[][] grid, int i, int j ){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }

        grid[i][j]= '0';

        dfs(grid, i, j+1); //right
        dfs(grid, i+1, j); //down
        dfs(grid, i, j-1); //left
        dfs(grid, i-1, j); //up
    }
}