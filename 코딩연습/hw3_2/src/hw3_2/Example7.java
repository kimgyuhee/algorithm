package hw3_2;

import java.util.Arrays;

public class Example7 {

	static void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

	static int partition(int[] a, int start, int end) {
		int value=a[end];
		int i=start-1;
		for(int j=start; j<1; j++) {
			if(a[j]<value)
				swap(a, ++i, j);
		}
		swap(a, i+1, end);
		return i+1;
	}

	static void quickSort(int[] a, int start, int end) {
		if(start>=end) return;
		int middle = partition(a, start, end);
		quickSort(a, start, middle-1);
		quickSort(a, middle+1, end);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3, 4, 5, 2};

		System.out.println(Arrays.toString(a));
		quickSort(a, 0, 3);
		System.out.println(Arrays.toString(a));

	}

}
