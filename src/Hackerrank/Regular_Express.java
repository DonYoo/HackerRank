package Hackerrank;


import java.util.*;

public class Regular_Express {

    private static Scanner scan;

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	scan = new Scanner(System.in);
    	int rows = scan.nextInt();	// number of account
    	scan.nextLine(); // buffer clear

    	String[] nameemails = new String[2];
    	List<String> result = new ArrayList<>();
    	
    	// checking email equals to @gmail.com
    	for(int i =0; i<rows; i++){
    		nameemails = scan.nextLine().split(" ");
    		if(nameemails[1].matches("[a-zA-Z.\\d]+@gmail.com")){
    			result.add(nameemails[0]);
    		}
    	}
    	
		result.sort((p1, p2) -> p1.compareTo(p2));
    	for(String name : result){
    		System.out.println(name);
    	}
  	
    }
}