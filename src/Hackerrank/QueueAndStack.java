package Hackerrank;
import java.util.*;

public class QueueAndStack {

	public QueueAndStack(){
		testStack = new Stack<String>();
		testQueue = new LinkedList<String>();
	}
	
	public void pushCharacter(char c){
		testStack.push(String.valueOf(c));
	}
	
	public char popCharacter(){
		return testStack.pop().charAt(0);
	}
	
	public void enqueueCharacter(char c){
		testQueue.add(String.valueOf(c));
	}

	public char dequeueCharacter(){
		char answer = testQueue.peek().charAt(0);
		testQueue.remove();
		return answer;
	}
	
	Stack<String> testStack;
	Queue<String> testQueue;
	
	
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        QueueAndStack p = new QueueAndStack();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
