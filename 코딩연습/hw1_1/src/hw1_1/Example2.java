package hw1_1;

public class Example2 {
	static int sum1(int n) {
		String s="";
		System.out.print(s+=n+" ");
		if(n==1) return 1;
		return n+sum1(n-1);
	}
	
	static int sum2(int n) {
		int sum=0;
		String s="";
		for(int i=n; n>0; n--) {
			sum+=n;
			s=s+n+" ";
		}
		System.out.print(s);
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("����Լ��� �̿��� ���� �Լ�");
		for(int i=3 ; i<=10; ++i) {
			System.out.printf("=> 1~%d������ �� = %d\n", i, sum1(i));
		}
		System.out.println("\n�ݺ����� �̿��� ���� �Լ�");
		
		for(int i=3 ; i<=10; ++i) {
			System.out.printf("=> 1~%d������ �� = %d\n", i, sum2(i));
		}
	}
}
