package Data_Structure;

import java.util.ArrayList;

/**
 * 
 * @author DonYoo
 *
 *Output Format

If the list contains a cycle, your function must return true. If the list does not contain a cycle, 
it must return false. The binary integer corresponding to the boolean value returned by your function is printed 
to stdout by our hidden code checker.

 */


public class Linked_Lists_Detect_Cycle {
	boolean hasCycle(Node head) {
	    if(head == null){
	        return false;
	    }
	    ArrayList<Node> nodelist = new ArrayList<>();
	    
	    while(head.next != null){
	        nodelist.add(head);
	        if(nodelist.indexOf(head.next) != -1){
	            return true;
	        }
	        head = head.next;
	    }
	    return false;
	}
}
