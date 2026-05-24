import java.util.*;

class Solution {
    
    public boolean isSafe(int[][] grid, int[][] visited,
                          int n, int i, int j) {
        
        return (i >= 0 && j >= 0 &&
                i < n && j < n &&
                grid[i][j] == 1 &&
                visited[i][j] == 0);
    }
    
    public void solve(int[][] grid, ArrayList<String> res,
                      int[][] visited, int n,
                      int i, int j, String path) {
        
        if(i == n - 1 && j == n - 1) {
            res.add(path);
            return;
        }
        
        visited[i][j] = 1;
        
        // Down
        if(isSafe(grid, visited, n, i + 1, j)) {
            solve(grid, res, visited, n,
                  i + 1, j, path + "D");
        }
        
        // Left
        if(isSafe(grid, visited, n, i, j - 1)) {
            solve(grid, res, visited, n,
                  i, j - 1, path + "L");
        }
        
        // Right
        if(isSafe(grid, visited, n, i, j + 1)) {
            solve(grid, res, visited, n,
                  i, j + 1, path + "R");
        }
        
        // Up
        if(isSafe(grid, visited, n, i - 1, j)) {
            solve(grid, res, visited, n,
                  i - 1, j, path + "U");
        }
        
        visited[i][j] = 0;
    }

    public ArrayList<String> ratInMaze(int[][] maze) {
        
        int n = maze.length;
        ArrayList<String> res = new ArrayList<>();
        
        if(maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return res;
        }
        
        int[][] visited = new int[n][n];
        
        solve(maze, res, visited, n, 0, 0, "");
        
        return res;
    }
}