package sort;

import java.util.Arrays;

public class Insertion {

	static void insertionSort(int[] a) {
		for(int i=1; i<a.length; ++i) {
			int value=a[i];
			int j;
			for(j=i-1; j>=0; --j) {
				if(a[j]>value)
					a[j+1]=a[j];
				else
					break;
			}
			a[j+1]=value;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {14, 19, 11, 20, 12, 18, 13, 15, 17, 16};

		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}

}
