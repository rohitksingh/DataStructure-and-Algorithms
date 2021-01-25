package Walmart;

public class NumOfIsland {

    public int numIslands(char[][] grid) {

        int num_of_island = 0;

        for(int i=0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    num_of_island = num_of_island + dfs(grid, i, j);
                }
            }
        }


        return num_of_island;

    }

    public int dfs(char[][] grid, int i , int j){

        if(i<0 || i>grid.length-1 || j<0 || j> grid[0].length-1 || grid[i][j]=='0') {
            return 0;
        }

        grid[i][j]='0';

        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);

        return 1;


    }
}
