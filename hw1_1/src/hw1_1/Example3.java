package hw1_1;

public class Example3 {
	
	static class Node {
		int value;
		Node next;
		
		public Node(int value, Node next) {
			this.value=value;
			this.next=next;
		}
		
		
		public void printAll2() {
			Node temp=next;
			System.out.printf("%d ", this.value);
			while(temp!=null) {
				System.out.printf("%d ", temp.value);
				temp = temp.next;
			}
		}
		
		public void printAll1() {
			System.out.printf("%d ", this.value);
			if(next!=null) next.printAll1();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=null;
		for(int i=1; i<=10; i++) {
			root= new Node(i, root);
		}
		System.out.println("����Լ��� �̿��� ���Ḯ��Ʈ ���");
		root.printAll1();
		
		System.out.println("\n�ݺ����� �̿��� ���Ḯ��Ʈ ���");
		root.printAll2();
	}

}
