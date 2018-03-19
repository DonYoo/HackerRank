package Amazon;

import java.util.Arrays;
import java.util.Scanner;

public class N_Queen {

	private int current_row =0;
	private int current_col =0;
	
	private static int size = 0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testcase = in.nextInt();
		for(int i=0; i<testcase; i++){
			size = in.nextInt();
			
			int[][] chessboard = new int[size][size];
			for (int[] row : chessboard)
			    Arrays.fill(row, 0);
		}
	}

	private static boolean solveChessboard(int[][] chessboard, int row) {
		if(row == 3){
			return true;
		}
		
		for(int col=0; col<size; col++){
			if(isValid(chessboard, row, col)){
				chessboard[row][col] = 1;
				if(solveChessboard(chessboard, row++)){
					return true;
				}
				chessboard[row][col] = 0;
			}
		}
		return false;
	}

	private static boolean isValid(int[][] chessboard, int row, int col) {
		// check cross
		for(int i=0; i<size; i++){
			// columns check
			if(chessboard[row][i] != 0){
				return false;
			}
			// rows check
			if(chessboard[i][col] != 0){
				return false;
			}
		}
		
		// check X across
		/* Check upper diagonal on left side */
        for (int i=row, j=col; i>=0 && j>=0; i--, j--)
            if (chessboard[i][j] == 1)
                return false;
 
        /* Check lower diagonal on left side */
        for (int i=row, j=col; j>=0 && i<size; i++, j--)
            if (chessboard[i][j] == 1)
                return false;
		
		return true;
	}

}
