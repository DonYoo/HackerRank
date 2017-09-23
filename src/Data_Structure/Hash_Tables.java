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
 *Output Format

Print Yes if he can use the magazine to create an untraceable replica of his ransom note; otherwise, print No.

Sample Input 0

6 4
give me one grand today night
give one grand today
Sample Output 0

Yes
Sample Input 1

6 5
two times three is not four
two times two is four
Sample Output 1

No
 */
public class Hash_Tables {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        
        ArrayList<String> magazine = new ArrayList<>();
        ArrayList<String> ransom = new ArrayList<>();
        
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine.add(in.next());
        }

        for(int ransom_i=0; ransom_i < n; ransom_i++){
        	ransom.add(in.next());
        }
        
        String result = "Yes";
        for(String word : ransom){
        	int position = magazine.indexOf(word);
        	if(position != -1){
        		magazine.remove(position);	// remove index is much faster than remove word. big O
        	}
        	else{
        		result = "No";
        		break;
        	}
        }
        System.out.println(result);
    }
}