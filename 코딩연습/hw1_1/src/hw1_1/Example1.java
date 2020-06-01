package hw1_1;

public class Example1 {
	static void print(int[] a) {
		for(int i : a)
			System.out.printf("%d ", i);
	}
	
	//����Լ� ���
	static void insert(int[] a, int index, int value) {
		if(index<a.length) {
			int next=a[index];
			a[index]=value;
			insert(a, index+1, next);
		}
	}
	/**************************
	//�ݺ��� ���
	static void insert(int[] a, int index, int value) {
		for(int i=a.length-1 ; i>index; i--) {
			a[i]=a[i-1];
		}
		a[index]=value;
	}
	***************************/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		for(int i=0; i<a.length; ++i)
			a[i] = i;
		
		insert(a, 5, -99);
		
		print(a);
	}

}
