package Hackerrank;
import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	public char calculate() {
		return '&';
	}
	 
}

class Student extends Person{
	Student(String firstName, String lastName, int identification, int[] testScores2) {
		super(firstName, lastName, identification);
		for(int s : testScores2){
			testScores = testScores2;
		}
	}

	private int[] testScores;

	public char calculate() {
		int average = 0;
		int total = 0;
		char Grade;
		for(int s : testScores){
			total += s;
		}
		average = total / testScores.length;
		
		if(isBetween(average, 90, 100)){
			Grade = 'O';
		}
		else if(isBetween(average, 80, 90)){
			Grade = 'E';
		}
		else if(isBetween(average, 70, 80)){
			Grade = 'A';
		}
		else if(isBetween(average, 55, 70)){
			Grade = 'P';
		}
		else if(isBetween(average, 44, 55)){
			Grade = 'D';
		}
		else{
			Grade = 'T';
		}
		return Grade;
		
	}
	
	public static boolean isBetween(int value, int min, int max)
	{
		return ((value >= min) && (value <= max));
	}
   
}



public class Inheritance {

	/**
	 * user's input<br>
	 * first name, Last name, id<br>
	 * number of scores<br>
	 * score on test....
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Person s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
