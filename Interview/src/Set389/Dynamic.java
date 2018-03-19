package Set389;

import java.util.*;
import java.lang.*;
import java.io.*;


/**
 * 
 * @author DonYoo
 *
 *You are given weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. Note that we have only one quantity of each item, In other words, given two integer arrays val[0..N-1] and wt[0..N-1] which represent values and weights associated with N items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, either pick the complete item, or don¡¯t pick it (0-1 property).
 

Input:

The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of four lines. The first line consists of N the number of items. The second line consists of W, the maximum capacity of the knapsack. In the next  line are N space separated positive integers denoting the values of the N items and in the fourth line are N space separated positive integers denoting the weights of the corresponding items.
 

Output:

Print the maximum possible value you can get with the given conditions that you can obtain for each test case in a new line.
 

Constraints:

1¡ÂT¡Â100

1¡ÂN¡Â100

1¡ÂW¡Â100

1¡Âv[i]¡Â100

1¡Âwt[i]¡Â100

Example:

Input:
1
3
4
1 2 3
4 5 1

Output:
3
 */


class Pair implements Comparable<Pair> {
	
	public int value;
	public int weight;
	
	public Pair(int value){
		this.value = value;
	}
	
	@Override
    public int compareTo(Pair target) {
        if (this.value > target.value) {
            return 1;
        } else if (this.value < target.value) {
            return -1;
        }
        return 0;
    }
}


public class Dynamic {
	private static Scanner in;
	

	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		int testcase = in.nextInt();
		
		for(int k=0; k< testcase; k++){
			
			int input = in.nextInt();
			int maxweight = in.nextInt();
			
			Pair [] self = new Pair[input];
			
			// getting value
			for (int i = 0; i<input; i++){
				self[i] = new Pair(in.nextInt());
			}
			
			// getting weight
			for (int i = 0; i<input; i++){
				self[i].weight = in.nextInt();
			}
			Arrays.sort(self);
			
			for (int i = 0; i<input; i++){
				System.out.print(self[i].value + " ");
			}
			System.out.println();
			for (int i = 0; i<input; i++){
				System.out.print(self[i].weight+ " ");
			}
			
		}
		
		
		

	}

}
