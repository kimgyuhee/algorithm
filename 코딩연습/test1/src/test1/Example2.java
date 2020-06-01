package test1;

public class Example2 {
	
	static class Node {
		int value;
		Node next;
		
		public Node(int value, Node next) {
			this.value=value;
			this.next=next;
		}
		
		public void print() {
			if(next != null) next.print();
			System.out.printf("%d ", value);
		}
	}
	
	static void D() {
		Node node = new Node(1, new Node(2, new Node(3, null)));
		node.print();
	}
	
	static void E() {
		Node node = new Node(3, new Node(2, new Node(1, null))); 
	    while (node != null) { 
	        System.out.printf("%d ", node.value); 
	        node = node.next; 
	    }

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D(); System.out.println();
		
		E(); System.out.println();

	}

}
