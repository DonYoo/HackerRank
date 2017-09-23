package Hackerrank;
import java.util.*;

public class StringtoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 String S = in.next();
		 in.close();
		 try{
			 int myInt = Integer.parseInt(S);
			 System.out.println(myInt);
		 }
		 catch(Exception e){
			 System.out.println("Bad String");
		 }
	}
}
