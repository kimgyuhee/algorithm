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
		
		System.out.print("X의 좌표를 입력 : ");
		int x=src.nextInt();
		System.out.print("Y의 좌표를 입력 : ");
		int y=src.nextInt();	
		System.out.print("개구리 점프력 입력 : ");
		int d=src.nextInt();
		
		System.out.println("점프수  : "+count(x,y,d));
	}

}
