package hw3_1;

import java.util.Arrays;

public class Example6 {

	static void swap(char[] c, int i, int j) {
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = new char[]{'a', 'z', 'b', 'y', 'c'};
		
		
		for(int i=c.length-1 ; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(c[j]>c[j+1])
					swap(c,j,j+1);
			}
		}
		
		System.out.println(Arrays.toString(c));
	}

}
