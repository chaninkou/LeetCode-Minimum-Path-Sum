package leetcode64;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
		
		System.out.println("Input: " + Arrays.deepToString(grid));
		
		FindMinimumPathSumFunction solution = new FindMinimumPathSumFunction();
		
		System.out.println("Solution: " + solution.minPathSum(grid)); 
	}
}
