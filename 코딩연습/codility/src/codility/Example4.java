package codility;

//문제링크 : https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
public class Example4 {

	static void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] {9,3,9,3,9,7,9};
		int index=0;
		int same=0;
		
				
		for(int i=0; i<A.length; i++) {
			same=0;
			for(int j=0; j<A.length;j++) {
				if(A[i]==A[j]) {
					same++;
				}
			}
			if(same%2==1)
				index=i;
		}
		
		System.out.println("짝이 없는 index는 "+index+"입니다.");
	}

}
