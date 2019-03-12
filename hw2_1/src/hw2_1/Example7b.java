package hw2_1;

import java.util.Scanner;

public class Example7b {

	static void print1(int n) {
		for(int i=0 ; i<n; i++) {
			for(int j=0; j<n-i-1; j++)
				System.out.print(" ");
			for(int k=n-i; k<=n; k++)
				System.out.print("*");
			System.out.println();
		}
	}

	static void print2(int n, int i, int j) {
		if(i<n) {
			if(j<n-i-1)
				System.out.print(" ");
			else
				System.out.print("*");
			
			if(j<n-1)
				print2(n, i, j+1);
			else {
				System.out.println();
				print2(n, i+1, 0);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.print("�� ���� �Է��Ͻÿ� : ");
			int n = scanner.nextInt();
			print1(n);
			System.out.println();
			print2(n,0,0);
		}
	}

}
