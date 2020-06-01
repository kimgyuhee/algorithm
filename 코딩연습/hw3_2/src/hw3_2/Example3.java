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
		int value = a[end]; // 기준값
		int i= start-1; // i는 1구역의 끝지점
		// 1구역 : 기준값보다 작거나 같은 값들이 위치할곳
		for(int j=start; j<end; j++) { // j는 3구역의 시작지점
		// 3구역 : 아직 비교하지 않아서 위치가 정해지지 않은 값들
			if(a[j]<value) // a[j] 값이 1구역에 속하면
				swap(a, ++i, j); //a[j] 값을 1구역 끝에 추가한다. 1구역 크기 1증가.
		}
		swap(a, i+1, end); // 기준값인  a[end]원소와 2구역의 시작원소를 비교
		// 2구역 : 기준값보다 큰 값들이 위치할 곳
		return i+1; // 기준값 위치 리턴
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
