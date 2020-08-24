package leetcode64;

public class FindMinimumPathSumFunction {
	// Dp way
	public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int[][] dp = new int[n][m];
        
        dp[0][0] = grid[0][0];
        
        // Add up all the top row
        for(int i = 1; i < m; i++){
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }
        
        // Add up all the left col
        for(int j = 1; j < n; j++){
            dp[j][0] = dp[j - 1][0] + grid[j][0];
        }
        
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
            	// Get the minimum sum of two points ( top or left )
                dp[i][j] = Math.min(grid[i][j] + dp[i][j - 1], grid[i][j] + dp[i - 1][j]);
            }
        }
        
        return dp[n - 1][m - 1];
    }
	
	// Without using extra space method, cleaner code but changed original array
    public int minPathSum2(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i = 1; i < m; i++){
            grid[0][i] += grid[0][i - 1];
        }
        
        for(int j = 1; j < n; j++){
            grid[j][0] += grid[j - 1][0];
        }
        
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                grid[i][j] += Math.min(grid[i][j - 1], grid[i - 1][j]);
            }
        }
        
        return grid[n - 1][m - 1];
    }
}
