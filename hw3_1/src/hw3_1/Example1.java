package hw3_1;

import java.util.Arrays;

public class Example1 {
	
	static void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	static int findMin(int[] a, int start) {
		int min=a[start];
		int minIndex=start;
		for(int i=start+1; i<a.length; i++) {
			if(min>a[i]) {
				min=a[i];
				minIndex=i;
			}
		}
		return minIndex;
	}
	
	static void selectionSort(int[] a) {
		for(int i=0; i<a.length-1; ++i) {
			int minIndex=findMin(a, i);
			swap(a, i, minIndex);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {14, 17, 15, 13, 11, 10, 12, 18, 16, 20, 19 };
		
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}

}
