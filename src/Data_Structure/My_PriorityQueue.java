package Data_Structure;

import java.util.PriorityQueue;


/**
 * 
 * @author DonYoo
 * very good example of PriorityQueue.
 * so the PriorityQueue automatically sort the list in order.
 */

class Prisoner implements Comparable<Prisoner> {

    String name;
    int weight;

    public Prisoner(String name, int weight) {
        super();
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Prisoner target) {
        if (this.weight > target.weight) {
            return 1;
        } else if (this.weight < target.weight) {
            return -1;
        }
        return 0;
    }
}


public class My_PriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Prisoner> priorityQueue = getPriorityQueue();

        System.out.println("=============== Normal Order");

        while (!priorityQueue.isEmpty()) {
            Prisoner prisoner = priorityQueue.poll();
            System.out.println(prisoner.name);
        }
	}

	private static PriorityQueue<Prisoner> getPriorityQueue() {
        Prisoner prisoner1 = new Prisoner("james", 5);
        Prisoner prisoner2 = new Prisoner("schofield", 99);
        Prisoner prisoner3 = new Prisoner("alex", 14);
        Prisoner prisoner4 = new Prisoner("silvia", 10);
        Prisoner prisoner5 = new Prisoner("thomson", 1);
        
        if(prisoner1.compareTo(prisoner4) == 1){
        	System.out.println("don is right");
        }

        PriorityQueue<Prisoner> priorityQueue = new PriorityQueue<Prisoner>();

        priorityQueue.offer(prisoner1);
        priorityQueue.offer(prisoner2);
        priorityQueue.offer(prisoner3);
        priorityQueue.offer(prisoner4);
        priorityQueue.offer(prisoner5);
        
        return priorityQueue;
    }
}
