
public class SequentialSearthST<Key, Value> {
	private Node first;
	private int N;
	
	private class Node {
		Key key;
		Value val;
		Node next;
		
		// why public ?
		private Node(Key key, Value val, Node next) {
			this.key = key;
			this.val = val;
			this.next = next;
		}
	}
	
	/**
	 * Initializes an empty symbol table.
	 */
	public SequentialSearthST() {
		
	}
	
	/**
	 * Returns the number of key-value pairs in this symbol table.
	 * @return the number of key-value pairs in this symbol table.
	 */
	public int size() {
		return N;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	/**
	 * If key is in the symbol table, return the value of the key; if not, return null.
	 * @param key the key
	 * @return the value associated with the given key if the key is in the symbol table.
	 */
	public Value get(Key key) {
		for (Node x = first; x != null; x = x.next) {
			if (key.equals(x.key)) return x.val;
		}
		return null;
		/*Node tmp = first;
		while (tmp != null) {
			if (tmp.key == key) break;
			else tmp = tmp.next;
		}
		if (tmp != null) return tmp.val;
		return null;*/
	}
	
	public boolean contains(Key key) {
		return get(key) != null;
	}
		
	public 	void put(Key key, Value val) {
		for (Node tmp = first; tmp != null; tmp = tmp.next) {
			if (tmp.key.equals(key)) {
				tmp.val = val;
				return;
			}
		}
		N++; 
		first = new Node (key, val, first);
	}
	
	public void delete(Key key) {
	    first = delete(first, key);
	}

	// delete key in linked list beginning at Node x
	// warning: function call stack too large if table is large
	private Node delete(Node x, Key key) {
	    if (x == null) return null;
	    if (key.equals(x.key)) {
	         N--;
	         return x.next;
	    }
	    x.next = delete(x.next, key);
	    return x;
	}
	
	/*public void delete(Key key) {
		Node tmp = first;
		if (first != null && first.key.equals(key)) first = first.next;
		for (tmp = first; tmp!= null && tmp.next != null; tmp = tmp.next) {
			if (tmp.next.key.equals(key)) {
				tmp.next = tmp.next.next;
			}
		}
	}*/
	
	public Iterable<Key> keys() {
		Queue<Key> queue = new Queue<Key>();
		for (Node x = first; x != null; x = x.next) {
			queue.enqueue(x.key);
		}
		return queue;
	}
	
	public static void main(String[] args) {
		SequentialSearthST<Integer, String> st = new SequentialSearthST<Integer, String>();
		st.put(0, "A");
		st.put(1, "b");
		st.put(2, "c");
	    st.delete(2);
	    st.delete(2);
	    st.delete(1);
		for (Integer s : st.keys()) {
			System.out.println(s + "  " + st.get(s));
		}
	}
}





















