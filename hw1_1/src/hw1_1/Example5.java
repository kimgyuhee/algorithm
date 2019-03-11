package hw1_1;

public class Example5 {
	
	static void print(int[] a) {
		for(int i : a)
			System.out.printf("%d ", i);
	}
	
	/****************************************
	//반복문 사용
	static void remove(int[] a, int index) {
		for(int i=index; i<a.length-1; i++) {
			a[i]=a[i+1];
		}
		a[a.length-1]=0;
	}
	*******************************************/
	
	//재귀함수 사용
	static void remove(int[] a, int index) {
		if(index<a.length-1) {
			a[index]=a[index+1];
			remove(a, index+1);
		}
		a[a.length-1]=0;
	}
	
	 public static void main(String[] args) { 
		 int[] a = new int[10];
		 for(int i =0; i<a.length; i++)
			 a[i]=i;
		 
		 remove(a,5);
		 
		 print(a);
	 }
}
