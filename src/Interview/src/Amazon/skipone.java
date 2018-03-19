package Amazon;

import java.util.Scanner;

/**
 * 
 * @author DonYoo
 *
 *

Example:
Input:
2
6
5 5 10 100 10 5
3
1 2 3

Output:
110
4

Stickler is a thief and wants to loot money from a society of n houses placed in a line. He is a weird person and follows a rule while looting the houses and according to the rule he will never loot two consecutive houses. At the same time, he wants to maximize the amount he loots. The thief knows which house has what amount of money but is unable to find the maximum amount he can end up with. He asks for your help to find the maximum money he can get if he strictly follows the rule. Each house has a[i] amount of money present in it.

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case contains an integer n which denotes the number of elements in the array a[]. Next line contains space separated n elements in the array a[].

Output:
Print an integer which denotes the maximum amount he can take home.

 */
public class skipone {
	static Scanner in;
	public static void main (String[] args) {
		in = new Scanner(System.in);
		
		int testcase = in.nextInt();
		for(int j=0; j<testcase; j++){
		    int inputsize = in.nextInt();
		    
		    int include = in.nextInt();
		    int exclude = 0;
		    int oldinclude =0;
		    
		    for(int i=1;i<inputsize;i++){
		    	oldinclude = include;
		    	include = exclude + in.nextInt();
		    	exclude = (oldinclude>exclude) ? oldinclude:exclude;
		    }
		    System.out.println((include>exclude) ? include:exclude);
		}
	}
}