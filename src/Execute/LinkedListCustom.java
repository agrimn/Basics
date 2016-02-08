package Execute;

public class LinkedListCustom {
		 
	private int counter;
	private Node head;
	 
	// Default constructor
	public LinkedListCustom() {	
		counter = 0;
	}
	
	public int getCounter() {
		return counter;
	}
 
	private void incrementCounter() {
		counter++;
	}
 
	private void decrementCounter() {
		counter--;
	}
	 
	// appends the specified element to the end of this list.
	public void add(Object data) {
		// Initialize head only if 1st element is missing
		if (head == null) {
			head = new Node(data);
		} else {
			Node tail = get(counter);
			Node temp = new Node(data);
			tail.setNext(temp);
		}
		incrementCounter();
	}
	 
	// inserts the specified element at the specified position in this list
	public void add(Object data, int index) {
		if(index > counter) {
			System.out.println("Out of Bounds");
		} else {
			Node current = get(index);
			Node temp = new Node(data);
			temp.setNext(current.getNext());
			current.setNext(temp);
		}
		incrementCounter();
	}

	// returns the Node at the specified position in this list.
	private Node get(int index) {
		Node temp;
		if (index > counter) {
			System.out.println("Out of Bounds");
			return null;
		} else {
			temp = head;
			for (int i = 0; i < index-1; i++)
				temp = temp.getNext();
		}
		return temp;
	}
	
	public Object getValue(int index) {
		if (index > counter) {
			System.out.println("Out of Bounds");
			return null;
		} else {
			Node temp = get(index);
			return temp.getData();
		}
	}
	 
	// removes the element at the specified position in this list.
	public boolean remove(int index) {
		if(index > counter) {
			System.out.println("Out of Bounds");
			return false;
		} else {
			Node temp = head;
			for (int i = 0; i < index-2; i++)
				temp = temp.getNext();
			Node remove = temp.getNext();
			temp.setNext(remove.getNext());
		}
		decrementCounter();
		return true;
	}
	
	public int find(Object data) {
		if(head == null ){
			return -1;
		} else {
			Node temp = head;
			for(int i = 0; i < counter;i++){
				if(temp.getData().equals(data))
					return i;
				temp = temp.getNext();
			}
		}
		return -1;
	}
	 
	private class Node {
		Node next;
		Object data;
 
		// Node constructor
		public Node(Object dataValue) {
			next = null;
			data = dataValue;
		}
 
		// another Node constructor if we want to specify the node to point to.
		@SuppressWarnings("unused")
		public Node(Object dataValue, Node nextValue) {
			next = nextValue;
			data = dataValue;
		}
 
		// these methods should be self-explanatory
		public Object getData() {
			return data;
		}
 
		@SuppressWarnings("unused")
		public void setData(Object dataValue) {
			data = dataValue;
		}
 
		public Node getNext() {
			return next;
		}
 
		public void setNext(Node nextValue) {
			next = nextValue;
		}
	}
}
