package HackerRank_Algorithm;

import java.util.Scanner;

/**
 * 
 * 
 * @author DonYoo
 *
 *

Sample Input
6 3
1 3 2 6 1 2

Sample Output
5

Explanation
1+2=3
1+2=3
3+6=9
2+1=3
1+2=3

O(n) instead of O(n^2)
use bucket and store the number.

 *
 *
 *
 *
6 3
1 3 2 6 1 2

Input: 1
INITIAL STATE: Bucket[0]:0; Bucket[1]:0; Bucket[2]:0 Count:0
Remainder r: 1
Complement: 3 - r = 2
count+= Bucket[2]:0
bucket[1]++

Input: 3
INITIAL STATE: Bucket[0]:0; Bucket[1]:1; Bucket[2]:0 Count:0
Remainder r: 0
Complement: 3 - r = 3 -> 0 //(3 gets switched for 0 =) ).
count+= bucket[0]:0
bucket[0]++

Input: 2
INITIAL STATE: Bucket[0]:1; Bucket[1]:1; Bucket[2]:0 Count:0
Remainder r: 2
Complement: 3 - r = 1
count+= bucket[1]:1
bucket[2]++

Input: 6
INITIAL STATE: Bucket[0]:1; Bucket[1]:1; Bucket[2]:1 Count:1
Remainder r: 0
Complement: 3 - r = 3 -> 0
count+= bucket[0]:1
bucket[0]++

Input: 1
INITIAL STATE: Bucket[0]:2; Bucket[1]:1; Bucket[2]:1 Count:2
Remainder r: 1
Complement: 3 - r = 2
count+= bucket[2]:1
bucket[1]++

Input: 2
INITIAL STATE: Bucket[0]:2; Bucket[1]:2; Bucket[2]:1 Count:3
Remainder r: 2
Complement: 3 - r = 1
count+= bucket[1]:2
bucket[2]++

FINAL STATE: Bucket[0]:2; Bucket[1]:2; Bucket[2]:2 Count:5
 */
public class Divisible_Sum_Pairs {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[k];
        int count = 0;
        
        for(int ar_i = 0; ar_i < n; ar_i++){
            int value = in.nextInt();
            int cal = value%k;
            if(cal == 0){
            	cal = k;
            }
            count += ar[k-cal];
            ar[value%k]++;
        }
        System.out.println(count);
    }
}