package codility;

//문제 링크 : https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.print("반복할 횟수를 입력하시오 ->");
		int n = scr.nextInt();

		int[] a = new int[] {3,8,9,7,6};

		int temp=0;

		for(int i=0; i<n; i++) {
			temp=a[a.length-1];
			for(int j=a.length-1; j>0; j--) {
				a[j]=a[j-1];
			}
			
			a[0]=temp;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.printf("%d " , a[i]);
		}

	}

}
