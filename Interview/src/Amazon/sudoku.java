package Amazon;

import java.util.Scanner;

/**
 * 
 * @author DonYoo
 * 
input
1
3 0 6 5 0 8 4 0 0 5 2 0 0 0 0 0 0 0 0 8 7 0 0 0 0 3 1 0 0 3 0 1 0 0 8 0 9 0 0 8 6 3 0 0 5 0 5 0 0 9 0 6 0 0 1 3 0 0 0 0 2 5 0 0 0 0 0 0 0 0 7 4 0 0 5 2 0 6 3 0 0

output
3 1 6 5 7 8 4 9 2 5 2 9 1 3 4 7 6 8 4 8 7 6 2 9 5 3 1 2 6 3 4 1 5 9 8 7 9 7 4 8 6 3 1 2 5 8 5 1 7 9 2 6 4 3 1 3 8 9 4 7 2 5 6 6 9 2 3 5 1 8 7 4 7 4 5 2 8 6 3 1 9

 */

public class sudoku {
	
	private static int selected_row =0;
	private static int selected_col =0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = in.nextInt();
		
		int[][] matrix = new int[9][9];

		// get input
		for(int i=0; i<total; i++){
			for(int row = 0; row<9; row++){
				for(int col = 0; col<9; col++){
					matrix[row][col] = in.nextInt();
				}
			}
		}
		print(matrix);
		solveSudoku(matrix);
		print(matrix);
	}

	private static boolean solveSudoku(int[][] matrix) {
		// find unassigned position
		if(!findUnassigned(matrix)){
			return true;
		}
		
		// keep the previous position
		int row = selected_row;
		int col = selected_col;
		
		// is valid
		for(int value = 1; value<10; value++){
			if(isValid(matrix, row, col, value)){
				matrix[row][col] = value;
				if(solveSudoku(matrix)){
					return true;
				}
				// backstack method make it 0 again
				matrix[row][col] = 0;
			}
		}
		return false;
	}

	private static boolean isValid(int[][] matrix, int row, int col, int value) {
		for(int i=0; i<9; i++){
			// columns check
			if(matrix[row][i]==value){
				return false;
			}
			// rows check
			if(matrix[i][col]==value){
				return false;
			}
		}
		// 3x3 check
		for(int i =0; i<3; i++){
			for(int j=0; j<3; j++){
				if(matrix[i+row-row%3][j+col-col%3]==value){
					return false;
				}
			}
		}
		return true;
	}

	private static boolean findUnassigned(int[][] matrix) {
		// if there is a 0
		for(int i = 0; i<9; i++){
			for(int j = 0; j<9; j++){
				if(matrix[i][j] == 0){
					selected_row = i;
					selected_col = j;
					return true;
				}
			}
		}
		return false;
	}

	private static void print(int[][] matrix) {
		for(int row = 0; row<9; row++){
			for(int col = 0; col<9; col++){
				System.out.print(matrix[row][col]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
