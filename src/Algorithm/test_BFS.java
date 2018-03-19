package Algorithm;

import java.util.Arrays;
import java.util.Scanner;


/*
 * 
 * 
 *
input

5
5
1 0 1 1 0
0 1 0 0 1
1 0 1 1 0
1 0 1 1 0
0 1 0 0 1
5
1
2
3
4
5


output
5
2
0
1
0


 * 
 * 
 * 
 */

public class test_BFS {
	private static Scanner in;
	public static void main(String[] args) {
		DFS_BFS don = new DFS_BFS();

		in = new Scanner(System.in);
		
		int row = in.nextInt();
		int column = in.nextInt();
		int grid[][] = new int[row][column];
		for(int i =0; i<column; i++){
			for(int j=0; j<row; j++){
				grid[j][i] = in.nextInt();				
			}
		}
		int []t = {1,2,3,4,5};
		int result[] = countRegion(grid, t);
		
		for(int i=0; i<result.length; i++){
			System.out.println(result[i]);
		}
	}
	private static int[] countRegion(int[][] grid, int[] t) {
		int[] result = new int[grid.length * grid[0].length];
		
		for(int i =0; i<grid.length; i++){
			for(int j=0; j<grid[0].length; j++){
				result[recursiveCount(grid, i, j)]++;
			}
		}
		
		int[] realanswer = new int[t.length];
		for(int i =0; i<t.length; i++){
			realanswer[i] = result[t[i]];
		}
		return realanswer;
	}
	private static int recursiveCount(int[][] grid, int i, int j) {
		int count = 0;
		if(i<0 || j<0 || i>=grid.length || j >= grid[0].length){
			return 0;
		}
		if(grid[i][j] == 0){
			return 0;
		}
		count = 1;
		grid[i][j] = 0;
		count += recursiveCount(grid, i+1, j);
		count += recursiveCount(grid, i, j+1);
		count += recursiveCount(grid, i-1, j);
		count += recursiveCount(grid, i, j-1);
		
		return count;
	}
	
    
    
    
}
