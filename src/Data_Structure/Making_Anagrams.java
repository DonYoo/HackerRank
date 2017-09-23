package Data_Structure;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * Output Format

Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.

Sample Input
cde
abc

Sample Output
4

 * @author DonYoo
 *
 */
public class Making_Anagrams {
    public static int numberNeeded(String first, String second) {
    	char[] firstChar = first.toCharArray();
    	char[] secondChar = second.toCharArray();
    	
    	int NumberofDelete = firstChar.length + secondChar.length;
    	
    	for(int i = 0; i< firstChar.length; i++){
    		for(int j =0; j< secondChar.length; j++){
        		if(firstChar[i] == secondChar[j]){
        			NumberofDelete -= 2;
        			secondChar[j] = ' ';
        			break;
        		}
    		}
		}
    	return NumberofDelete;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}