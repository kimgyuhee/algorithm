package test1;

import java.util.Scanner;
import java.util.Arrays;

class Stack<T> {
	int count;
	int[] array;

	public Stack() {
		count = 0;
		array = new int[20];
	}

	public int size() {
		return count;
	}

	public int isEmpty() {
		if(count==0) return 0;
		return 1;
	}
	public int top(){
		if(count==0) return -1;
		return array[count-1];
	}

	public int pop() {
		if(count==0) return -1;
		int top=array[--count];
		return top;
	}

	public void push(int n) {
		array[count++]=n;
	}

}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);

		Stack<Integer> stack = new Stack<>();

		System.out.print("숫자를 입력하시오. ");
		int n = scr.nextInt();

		for(int i=0 ; i<n; i++) {
			System.out.println("명령어를 입력하세요. -> ");
			String s = scr.next();
			String[] str = s.split(" ");
			if(s.equals("empty"))
				System.out.println(stack.isEmpty());
			else if(s.equals("pop"))
				System.out.println(stack.pop());
			else if(s.equals("top"))
				System.out.println(stack.top());
			else if(s.equals("size"))
				System.out.println(stack.size());
			else {
				stack.push(Integer.parseInt(str[1]));
			}
				

		}


	}

}
