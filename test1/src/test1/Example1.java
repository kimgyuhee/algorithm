package test1;

public class Example1 {
	static void A(int n) {
		if(n<=0) return;
		System.out.printf("%d ", n);
		A(n-2);
	}
	
	static int B(int n) {
		System.out.printf("%d ", n);
		if(n<=1) return 1;
		return n+B(n-1);
	}
	
	static int C(int n) {
		if (n < 1) return 1;
		System.out.printf("%d ", n);
		return n+C(n-1);
	}
	
	static public void main(String[] args) {
		A(5);
		System.out.println();
		
		System.out.println(B(3));
		
		System.out.println(C(3));

		
	}
}
