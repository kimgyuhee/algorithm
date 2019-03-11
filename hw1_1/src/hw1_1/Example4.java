package hw1_1;

public class Example4 {

	static class Node {
		int value;
		Node next;

		public Node(int value, Node next) {
			this.value=value;
			this.next=next;
		}

		public void printAll() {
			System.out.printf("%d ", this.value);
			if(next!=null) next.printAll();
		}
		
		/********************
		public void addTail(int value) { 
			if (next != null) next.addTail(value);
			else next = new Node(value, null);
		}
		********************/

		public void addTail(int value) {
			Node temp=this;
			Node newNode = new Node(value, null);
			if(temp.next==null)
				temp.next=newNode;
			else {
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(0, null);

		for(int i=1; i<=10; ++i)
			root.addTail(i);

		root.printAll();
	}

}
