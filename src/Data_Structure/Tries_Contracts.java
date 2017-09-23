package Data_Structure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


interface Vocabulary {
    boolean add(String word);
    boolean isPrefix(String prefix);
    boolean contains(String word);
}

/*
public class ListVocabulary implements Vocabulary{
	private ArrayList<String> words = new ArrayList<String>();
	
	public ListVocabulary(Collection<String> words){
		this.words.addAll(words);
		Collections.sort(this.words);
	}
	
}
*/

public class Tries_Contracts {

	//private TryNode root = new TryNode();
	

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            Operation(op, contact);
        }
    }

	private static void Operation(String op, String contact) {
		if(op.equals("add")){
			System.out.println("this is add");
			
		}
		else{	// op.equals("find")
			System.out.println("this is find");
		}
	}
}
