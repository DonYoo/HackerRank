package DataStructure;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;


/***
 * 
 * @author DonYoo
 * 
 * HashTable. Big o O(1)
 * 
 * point : put(key, value), get(key), remove(key)
 * 
 * for ArrayList 
 * point : get(index) for search, set(index, value) for insert.  
 * indexOf()
 */

class HashNode<K, V>{
	K key;
	V value;
	HashNode<K, V> next;
	
	public HashNode(K key, V value){
		this.key = key;
		this.value = value;
		next = null;
	}
}

class MyMap<K, V>{
	
	private ArrayList<HashNode<K, V>> mapList;
	private int capacity;
	private int currentsize;
	
	
	// get the hashCode and get reminder from mapSize.
	// this is where the key gets store.
	
	private int getBucketIndex(K key){
		int hashCode = key.hashCode();
		int index = hashCode % capacity;
		return index;
	}
	
	public MyMap(){
		mapList = new ArrayList<>();
		/*
		 * explanation why capacity start at 11.
		 * Basicly, when you have a hash table with a size that is power of 2, 
		 * it's easy to get a hash function based on the less relevant bits of the key.
		 * Using a prime number (as in 11) as the size of the table, 
		 * makes collision on the table rows less likely, so inserting is "cheaper".
		 * 
		 * interesting article about hash
		 * http://pzemtsov.github.io/2015/12/14/choosing-the-hash-maps-capacity.html
		 * 
		 * factors of RAM might affect but
		 * 8192 capacity is best size that takes least time to search
		 * if it's too short, the arraylist size need to be double,
		 * and recalculate hashcode and put them in new arraylist.
		 * threshold is 0.7. limit
		 * 
		 * if it's too big, it takes more time to lookup.
		 */
		
		capacity = 11;
		currentsize = 0; // since it just got created.
		
		for(int i=0; i<capacity; i++){
			mapList.add(null);
		}
	}

	public V get(K key){
		int index = getBucketIndex(key);
		HashNode<K, V> chain = mapList.get(index);
		
		// search key in chain.
		while(chain != null){
			if(chain.key.equals(key)){
				return chain.value;
			}
			chain = chain.next;
		}
		// not found
		return null; 
	}
	
	public V remove (K key){
		int index = getBucketIndex(key);
		HashNode<K, V> chain = mapList.get(index);
		
		// if the first element is the one to be removed.
		if(chain.key.equals(key)){
			mapList.set(index, chain.next);
			currentsize--;
			return chain.value;
		}
		
		HashNode<K,V> prev = chain;
		chain = chain.next;
		// search key in chain.
		while(chain != null){
			if(chain.key.equals(key)){
				prev.next = chain.next;
				currentsize--;
				return chain.value;
			}
			prev = chain;
			chain = chain.next;
		}
		return null;
	}
	
	public void put(K key, V value){
		int index = getBucketIndex(key);
		HashNode<K, V> checkchain = mapList.get(index);
		
		// check if key is already exist.
		while(checkchain != null){
			if(checkchain.key.equals(key)){
				checkchain.value = value;
				return;
			}
			checkchain = checkchain.next;
		}
		
		// insert the node
		HashNode<K, V> temp = new HashNode<>(key, value);
		HashNode<K, V> chain = mapList.get(index);
		temp.next = chain;
		mapList.set(index, temp);

		
		currentsize++;
		
		// if currentsize/capacity is bigger than 0.7, make size double.
		// threshold = 0.7
		if( (1.0*currentsize)/capacity >= 0.7){
			ArrayList<HashNode<K, V>> templist = mapList;
			mapList = new ArrayList<>();
			capacity *= 2;
			// initialize new arraylist 
			for(int i=0; i<capacity; i++){
				mapList.add(null);
			}
			for(HashNode<K, V> headNode : templist){
				// check all the chain inside of entry.
				while(headNode !=null){
					// recursion
					put(headNode.key, headNode.value);
					headNode = headNode.next;
				}
			}
		}
	}
}

public class myHashTables {

	public static void main(String[] args) {
		
		// built in hashtable.
		
		Hashtable <String, String>dontable = new Hashtable<>();
		/*
		dontable.put("1", "donyoo");
		dontable.put("2", "donyood");
		
		System.out.println(dontable.get('1'));
		System.out.println(dontable);
		
		
		// custom hashtable.
		
		MyMap<Integer, String> map = new MyMap<>();
		map.put(1, "1");
		map.put(2, "2");
		map.put(3, "3");
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.remove(1));
		System.out.println(map.get(1));
		*/
		
		LinkedList<Integer> don = new LinkedList<>();
		don.add(1);
		don.add(2);
		don.add(3);
		
		System.out.println(don);
	}

}
