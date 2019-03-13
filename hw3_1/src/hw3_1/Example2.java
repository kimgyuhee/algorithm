package hw3_1;

import java.util.Arrays;

public class Example2 {
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}
	
	//bubble sort
	static void bubbleSort(int[] a) {
		/******************************
		for(int i=0; i<a.length-1; i++) {
			for(int j=0;j<a.length-i-1; j++) {
				if(a[j]>a[j+1])
					swap(a,j,j+1);
			}
		}
		******************************/
		for(int i=a.length-1; i>=1; i--) {
			boolean finish = true;
			for(int j=0; j<i; ++j) {
				if(a[j]>a[j+1]) {
					swap(a, j, j+1);
					finish=false;
				}
			}
			if(finish) break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 17, 14, 11, 19, 13, 15, 20, 12, 16, 18 };
		
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}

}
