package hw3_1;

import java.util.Arrays;

public class Example7 {

	static void sort(char[] a) {
		//Arrays.sort(a); O(NlogN)
		int[] count= new int[26];
		for(int i=0; i<a.length; ++i)
			count[a[i]-'a']++;
		int index=0;
		for(int i=0 ; i<count.length;i++) {
			char c= (char)('a'+i);
			for(int j=0; j<count[i]; j++)
				a[index++]=c;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a="helloworld".toCharArray();
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
