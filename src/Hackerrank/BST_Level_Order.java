package Hackerrank;
import java.util.*;

public class BST_Level_Order {

	private static void levelOrder(Node root) {
		LinkedList<Node> myQueue = new LinkedList<Node>();
		
		if(root != null){
			myQueue.add(root);
			while(!myQueue.isEmpty()){
				Node temp = myQueue.remove();
				
				System.out.print(temp.data + " ");
				
				if(temp.left != null){
					myQueue.add(temp.left);
				}
				if(temp.right != null){
					myQueue.add(temp.right);
				}
			}
		}
   
	}	
	
	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
            sc.close();
        }
}
