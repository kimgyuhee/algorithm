package codility;

import java.util.Scanner;

public class Example5 {

	static int count(int x, int y, int d) {
		int count=(y-x)/d-1;
		
		if(x>=y)
			return 0;
		
		if((y-x)/d==0)
			return count;
		else
			return count+1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		
		System.out.print("X�� ��ǥ�� �Է� : ");
		int x=src.nextInt();
		System.out.print("Y�� ��ǥ�� �Է� : ");
		int y=src.nextInt();	
		System.out.print("������ ������ �Է� : ");
		int d=src.nextInt();
		
		System.out.println("������  : "+count(x,y,d));
	}

}
