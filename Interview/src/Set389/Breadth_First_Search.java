package Set389;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 
 * @author DonYoo
 * 

Given a matrix of dimension r*c where each cell in the matrix can have values 0, 1 or 2 which has the following meaning:

0: Empty cell
1: Cells have fresh oranges
2: Cells have rotten oranges 
So we have to determine what is the minimum time required so that all the oranges become rotten. A rotten orange at index [i,j] can rot other fresh orange at indexes [i-1,j], [i+1,j], [i,j-1], [i,j+1] (up, down, left and right) in unit time. If it is impossible to rot every orange then simply return -1.

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case contains two integers r and c, where r is the number of rows and c is the number of columns in the array a[]. Next r line contains space separated c elements each in the array a[].

Output:
Print an integer which denotes the minimum time taken to rot all the oranges.(-1 if it is impossible).

Constraints:
1<=T<=100
1<=r<=100
1<=c<=100
0<=a[i]<=2

Example:
Input:
2
3 5
2 1 0 2 1
1 0 1 2 1
1 0 0 2 1
3 5
2 1 0 2 1
0 0 1 2 1
1 0 0 2 1

Output:
2
-1

 */

class Breadth_First_Search {
    private static Scanner in;
    
    static class table {
		public int [][] table;
        public int unittime;
        public boolean impossible;
        public int row;
        public int column;
        public boolean anychange;
        
        public table(int row, int column) {
        	this.row = row;
        	this.column = column;
            table = new int[row][column];
            unittime = 0;
            impossible = false;
        }
        
        public boolean done(){
    	    for(int i=0; i<row; i++){
		        for(int j=0; j<column; j++){
		        	int left = (i-1<0) ? 0:i-1;
		        	int right = (i+1>=row)?i:i+1;
		        	int bottom = (j+1>=column) ? j:j+1;
		        	int top = (j-1<0)?j:j-1;
		        	
		            if(table[i][j] == 1){
		            	if(table[left][j]== 2 ||
	            			table[right][j]==2 ||
	            			table[i][bottom]==2 ||
	            			table[i][top]==2 ){
		            		return false;
		            	}
		            }
	        	}
		    }
    	    
    	    // make sure if its impossible.
    	    for(int i=0; i<row; i++){
		        for(int j=0; j<column; j++){
		        	if(table[i][j] == 1){
		        		unittime = -1;
		        	}
		        }
		    }
    	    return true;
    	}
        
        public void update() {
        	anychange = false;
            int[][] newtable = new int[row][column];
            
        	for(int i=0; i<row; i++){
		        for(int j=0; j<column; j++){
		        	int left = (i-1<0) ? 0:i-1;
		        	int right = (i+1>=row)?i:i+1;
		        	int bottom = (j+1>=column) ? j:j+1;
		        	int top = (j-1<0)?0:j-1;
		        	
		        	newtable[i][j]= table[i][j];
		        	if(table[i][j] == 1){
		        		if(table[left][j]== 2 ||
		            			table[right][j]==2 ||
		            			table[i][bottom]==2 ||
		            			table[i][top]==2 ){
		        			newtable[i][j]=2;
		        			anychange = true;
		        		}
		        	}
		        }
        	}
        	table = newtable;
        	unittime+= (anychange==true)?1:0;
        }
    }
    
	public static void main (String[] args) {
		in = new Scanner(System.in);
		
		int testcase = in.nextInt();
		for(int k=0; k<testcase; k++){
		    
		    int row = in.nextInt();
		    int column = in.nextInt();
		    
		    table myTable = new table(row, column);
		    // getting table
		    for(int i=0; i<row; i++){
		        for(int j=0; j<column; j++){
		            myTable.table[i][j] = in.nextInt();
		        }
		    }
		    System.out.println(rottenOrange(myTable));
		}
	}
	
	public static int rottenOrange(table myTable){
	    while(myTable.done() == false){	    
            myTable.update();
	    }
	    return myTable.unittime;
	}
}
