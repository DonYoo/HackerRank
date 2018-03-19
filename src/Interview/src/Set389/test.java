package Set389;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 
 * @author DonYoo
 * 
input
1
3 0 6 5 0 8 4 0 0 5 2 0 0 0 0 0 0 0 0 8 7 0 0 0 0 3 1 0 0 3 0 1 0 0 8 0 9 0 0 8 6 3 0 0 5 0 5 0 0 9 0 6 0 0 1 3 0 0 0 0 2 5 0 0 0 0 0 0 0 0 7 4 0 0 5 2 0 6 3 0 0

output
3 1 6 5 7 8 4 9 2 5 2 9 1 3 4 7 6 8 4 8 7 6 2 9 5 3 1 2 6 3 4 1 5 9 8 7 9 7 4 8 6 3 1 2 5 8 5 1 7 9 2 6 4 3 1 3 8 9 4 7 2 5 6 6 9 2 3 5 1 8 7 4 7 4 5 2 8 6 3 1 9


2 10 3 2 10 2  = 20
 */

class test {
	
	public static Scanner in;
	
    // Driver program to test above function
    public static void main(String args[])
    {
        in = new Scanner (System.in);
        int input = in.nextInt();
        int k = in.nextInt();
        
        int []table = new int[k];
        
        for(int i=0; i<input; i++){
        	table[in.nextInt()%k]++;
        }
        
        int answer = table[0];
        for(int i=1; i<(k+1)/2; i++){
        	answer += Math.max(table[i], table[k-(i)]);
        }
        System.out.println(answer);
    }
}
