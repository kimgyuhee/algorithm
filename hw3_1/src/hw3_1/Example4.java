package hw3_1;

import java.util.Arrays;

public class Example4 {

	static void swap(String[] s, int i, int j) {
		String temp=s[i];
		s[i]=s[j];
		s[j]=temp;
	}
	
	static int minIndex(String[] s, int start) {
		String min=s[start];
		int minIndex=start;
		for(int i=start+1; i<s.length; i++) {
			if(s[i].compareTo(min)<0) {
				min=s[i];
				minIndex=i;
			}
				
		}
		
		return minIndex;
	}
	
	static void stringSort(String[] s) {
		for(int i=0; i<s.length-1; i++) {
			int minIndex =  minIndex(s, i);
			swap(s, i, minIndex);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"zero", "lemon", "apple", "orange", "banana"};
		
		stringSort(s);
		System.out.println(Arrays.toString(s));
		
	}

}
