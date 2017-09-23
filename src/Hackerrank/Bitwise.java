package Hackerrank;
import java.util.Scanner;



/**
 * 
 * @author DonYoo
 *
 *Task 
Given set . Find two integers,  and  (where ), from set  such that the value of  is the maximum possible and also less than a given integer, . In this case,  represents the bitwise AND operator.

Input Format

The first line contains an integer, , the number of test cases. 
Each of the  subsequent lines defines a test case as  space-separated integers,  and , respectively.
 */
public class Bitwise {

	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int numberOfcase = sc.nextInt();
		
		for(int i =0; i<numberOfcase; i++){
			int Nnumber = sc.nextInt();
			int Knumber = sc.nextInt();
			int output = bitwise(Nnumber, Knumber);
			System.out.println(output);
		}
	}

	private static int bitwise(int nnumber, int knumber) {
		int maximum = 0;
		for(int i=1; i<=nnumber; i++){
			for(int j=i+1; j<=nnumber; j++){
				int bitand = i&j;
				if( (bitand<knumber) && (bitand > maximum)){
					maximum = bitand;
				}
			}
		}
		return maximum;
	}

}
