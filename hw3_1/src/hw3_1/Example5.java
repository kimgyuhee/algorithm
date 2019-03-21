package hw3_1;

import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{3,6,10,4,1,8,2,7,9,5};
		
		for(int i=1; i<a.length; i++) {
			int value=a[i];
			int j;
			for(j=i-1; j>=0; j--) {
				if(a[j]%2!=0)
					a[j+1]=a[j];
				else
					break;
			}
			a[j+1]=value;
		}
		
		System.out.println(Arrays.toString(a));
	}

}
