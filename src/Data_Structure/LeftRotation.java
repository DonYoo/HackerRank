package Data_Structure;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;


/**
 * 
 * @author DonYoo
 *
 *
 *Output Format

Print a single line of  space-separated integers denoting the final state of the array after performing  left rotations.

Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4
Explanation

When we perform  left rotations, the array undergoes the following sequence of changes:
 */
public class LeftRotation {
	 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        
        ArrayList<Integer>test = new ArrayList<>();
        
        for(int a_i=0; a_i < n; a_i++){
        	test.add(in.nextInt());
        }
        
        for(int i=0;i<k;i++){
        	test.add(test.get(0));
        	test.remove(0);
        }
        
        System.out.println(test.stream()
        		.map(Object::toString)
        		.collect(Collectors.joining(" ")));
    }
}
