package sort;

import java.util.Arrays;

// 선택 정렬 (selection sort)
public class Selection {
/******************************************
	//
	static int findMin(int[] a, int start) {
		int min=a[start];
		int minIndex=0;
		for(int i=start; i<a.length; i++) {
			if(a[i]<=min) {
				min=a[i];
				minIndex=i;
			}
				
		}
		return minIndex;
	}
********************************************/
	static void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	static int findMin(int[] a, int start) {
		int min=a[start];
		int minIndex=0;
		for(int i=start+1; i<a.length; i++) {
			if(a[i]<min) {
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
		int[] a = new int[]{14, 19, 11, 20, 12, 18, 13, 15, 17, 16};
		
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}

}
