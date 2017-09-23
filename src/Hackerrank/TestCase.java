package Hackerrank;
import java.util.Arrays;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "this is paragraphpp.";
		int size = test.length();
		int max = 0;
		int compare = 0;
		char compareChar;
		char maxChar = 0;
		
		char [] better = new char[size];
		for(int i =0; i < size; i++)
		{
			better[i] = test.charAt(i);
		}
		Arrays.sort(better);
		
		System.out.println(better);
		
		compareChar = better[0];
		for(int i = 0; i< size; i++){
			if(compareChar == better[i])
			{
				compare++;
			}
			else
			{
				if(max < compare)
				{
					max = compare;
					maxChar = compareChar;
				}
				compare = 1;
				compareChar = better[i];
			}
		}
		System.out.println(maxChar);
	}

}