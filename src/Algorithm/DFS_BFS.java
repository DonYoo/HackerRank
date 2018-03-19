package Algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/*
 * Depth First Search
 * Breathed First Search
 */

public class DFS_BFS {

	private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();
	
	public static class Node {
		private int id;
		
		LinkedList<Node> adjacent = new LinkedList<Node>();
		private Node(int id) {
			this.id = id;
		}
	}
	
	private Node getNode(int id) {
		return nodeLookup.get(id);		
	}
	
	public void addEdge(int source, int destination) {
		Node s = getNode(source);
		Node d = getNode(destination);
		s.adjacent.add(d);
	}
	
	public boolean hasPathDFS(int source, int destination){
		Node s = getNode(source);
		Node d = getNode(destination);
		HashSet<Integer> visited = new HashSet<Integer>();
		return hasPathDFS(s, d, visited);
	}

	private boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited) {
		if(visited.contains(source.id)){
			return false;
		}
		visited.add(source.id);
		if(source == destination){
			return true;
		}
		for (Node child : source.adjacent){
			if(hasPathDFS(child, destination, visited)){
				return true;
			}
		}
		return false;
	}
	
	public boolean hasPathBFS(int source, int destination){
		return hasPathBFS(getNode(source), getNode(destination));
	}

	private static boolean hasPathBFS(Node source, Node destination) {
		// headnode = nextToVisit 
		LinkedList<Node> nextToVisit = new LinkedList<Node>();
		HashSet<Integer> visited = new HashSet<Integer>();
		nextToVisit.add(source);
		
		while (!nextToVisit.isEmpty()) {
			Node node = nextToVisit.remove();
			if(node == destination){
				System.out.println("Success");
				return true;
			}
			// check if this node is visited.
			if(visited.contains(node.id)){
				continue;		//restart while loop
			}
			System.out.println(node.id);
			visited.add(node.id);
			
			// add check list like a queue.
			for (Node child : node.adjacent){
				nextToVisit.add(child);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Node G = new Node(0);
		Node R = new Node(1);
		Node A = new Node(2);
		Node P = new Node(3);
		Node H = new Node(4);
		
		Node B = new Node(5);
		Node N = new Node(6);
		Node M = new Node(7);
		Node Z = new Node(9);
		
		
		
		G.adjacent.add(B);
		B.adjacent.add(Z);
		
		G.adjacent.add(N);
		G.adjacent.add(M);
		
		
		
		G.adjacent.add(R);
		R.adjacent.add(A);
		A.adjacent.add(P);
		P.adjacent.add(H);
		
		hasPathBFS(G, H);
		
	}

}
