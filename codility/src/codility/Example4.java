package codility;

//������ũ : https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] {9,3,9,3,9,7,9};
		int index=0;
		int same=0;

		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A.length; j++) {
				if(A[i]==A[j]) {
					same=1;
					break;
				}
			}
			if(same==0) {
				index=i;
			}
		}

		System.out.println("¦�� ���� index�� "+index+"�Դϴ�.");
	}

}
