import java.util.*;

class Solution {
    
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        int[] board = new int[n]; // board[row] = col
        
        solve(0, n, board, ans);
        
        return ans;
    }
    
    public void solve(int row, int n, int[] board,
                      ArrayList<ArrayList<Integer>> ans) {
        
        if(row == n) {
            
            ArrayList<Integer> temp = new ArrayList<>();
            
            for(int i = 0; i < n; i++) {
                temp.add(board[i] + 1); // 1-based indexing
            }
            
            ans.add(temp);
            return;
        }
        
        for(int col = 0; col < n; col++) {
            
            if(isSafe(row, col, board)) {
                
                board[row] = col;
                
                solve(row + 1, n, board, ans);
            }
        }
    }
    
    public boolean isSafe(int row, int col, int[] board) {
        
        for(int prevRow = 0; prevRow < row; prevRow++) {
            
            int prevCol = board[prevRow];
            
            // Same column
            if(prevCol == col) {
                return false;
            }
            
            // Diagonal check
            if(Math.abs(prevRow - row) ==
               Math.abs(prevCol - col)) {
                return false;
            }
        }
        
        return true;
    }
}