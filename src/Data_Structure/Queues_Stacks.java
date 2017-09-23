package Data_Structure;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * 
 * @author DonYoo
 *
 *
 *
 *Sample Input

3
{[()]}
{[(])}
{{[[(())]]}}
Sample Output

YES
NO
YES
Explanation

The string {[()]} meets both criteria for being a balanced string, so we print YES on a new line.
The string {[(])} is not balanced, because the brackets enclosed by the matched pairs [(] and (]) are not balanced. Thus, we print NO on a new line.
The string {{[[(())]]}} meets both criteria for being a balanced string, so we print YES on a new line.
 */


public class Queues_Stacks {
    	
    public static boolean isBalanced(String expression) {
    	Stack <Character>st = new Stack<>();
        char[] bracket = expression.toCharArray();
        if(bracket.length%2 !=0){
        	return false;
        }
        for(int i=0; i<bracket.length; i++){
        	char pren = bracket[i];
        	if(pren=='{' || pren=='(' || pren=='['){
        		if(i == bracket.length-1){
        			return false;
        		}
        		st.push(pren);
        	}
        	else{
        		if(st.isEmpty()){
        			return false;
        		}
        		if((pren =='}') && (st.pop() != '{')){
        			return false;
        		}
        		else if((pren ==')') && (st.pop() != '(')){
        			return false;
        		}
        		else if((pren ==']') && (st.pop() != '[')){
        			return false;
        		}
        	}
        }
    	return true;
    }

	public static void main(String[] args){
    	
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}