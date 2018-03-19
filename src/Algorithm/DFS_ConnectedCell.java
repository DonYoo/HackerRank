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
public class DFS_ConnectedCell {

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
		int result[] = getBiggestRegion(grid, t);
		
		for(int i=0; i<result.length; i++){
			System.out.println(result[i]);
		}
	}
	
    public static int[] getBiggestRegion(int[][] matrix, int[] t) {
    	int [] result = new int[t.length+1];
    	
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
            	result[countCells(matrix, i, j)]++;
            }
        }
        int [] real_result = Arrays.copyOfRange(result, 1, 6);
        return real_result;
    }
    
    private static int countCells(int[][] matrix, int i, int j) {
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) return 0;
        if (matrix[i][j] == 0) return 0;
        int count = 1;
        matrix[i][j] = 0;
        count += countCells(matrix, i + 1, j);
        count += countCells(matrix, i - 1, j);
        count += countCells(matrix, i, j + 1);
        count += countCells(matrix, i, j - 1);
        return count;
    }
}
