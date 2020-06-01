package codility;

import java.util.Scanner;

public class Example2 {

	//문제 링크 : https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.print("정수를 입력하세요. ");
		int n=scr.nextInt();

		System.out.println(Integer.toBinaryString(n));

		String s=Integer.toBinaryString(n);
		char[] c= new char[s.length()];
		

		int temp=0;
		int max=0;
		
		for(int a=0; a<c.length; a++) {
			c[a]=s.charAt(a);
		}
		
		for(int i=1; i<s.length(); i++) {
			if(c[i]=='0') {
				temp++;
			}
			else {
				if(max<temp)
					max=temp;
				temp=0;
			}
		}
		
		if(max==0)
			System.out.println("1과 1 사이에 0이 존재하지 않습니다.");
		else
			System.out.println("1과 1사이의 0의 최댓값 : "+max);
		
	}

}
