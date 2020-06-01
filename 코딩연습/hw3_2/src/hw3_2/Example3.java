package hw3_2;

import java.util.Arrays;
import java.util.Random;

public class Example3 {

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static int partition(int[] a, int start, int end) {
		int value = a[end]; // ���ذ�
		int i= start-1; // i�� 1������ ������
		// 1���� : ���ذ����� �۰ų� ���� ������ ��ġ�Ұ�
		for(int j=start; j<end; j++) { // j�� 3������ ��������
		// 3���� : ���� ������ �ʾƼ� ��ġ�� �������� ���� ����
			if(a[j]<value) // a[j] ���� 1������ ���ϸ�
				swap(a, ++i, j); //a[j] ���� 1���� ���� �߰��Ѵ�. 1���� ũ�� 1����.
		}
		swap(a, i+1, end); // ���ذ���  a[end]���ҿ� 2������ ���ۿ��Ҹ� ��
		// 2���� : ���ذ����� ū ������ ��ġ�� ��
		return i+1; // ���ذ� ��ġ ����
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] a = new int[10];
		for(int i=0; i<a.length; i++) {
			a[i]=random.nextInt(20);
		}
		
		System.out.println(Arrays.toString(a));
		int middle=partition(a, 0, a.length-1);
		System.out.println(Arrays.toString(Arrays.copyOfRange(a, 0, middle))+" ");
		System.out.println(Arrays.toString(Arrays.copyOfRange(a, middle, a.length)));
	}

}
