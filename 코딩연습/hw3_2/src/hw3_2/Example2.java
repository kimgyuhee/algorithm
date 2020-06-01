package hw3_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example2 {
	
	// a�� �迭���� start���� end ������ ���� �����Ѵ�.
	static void mergeSort(int[] a, int start, int end) {
		if(start==end) return; //������ ���̰� 1�̸� ��� �����Ѵ�.
		int middle=(start+end)/2; //start�� end�� �߰������� ����Ѵ�.
		
		mergeSort(a, start, middle); //�պκ��� �����ϱ� ���� ��� ȣ��
		mergeSort(a, middle+1, end); //�޺κ��� �����ϱ� ���� ��� ȣ��
		merge(a, start, middle, end); //�պκа� �޺κ��� ����
		
	}
	
	//a �迭���� �պκ�(start~middle)�� �޺κ�(middle+1~end)�� �����Ѵ�.
	static void merge(int[] a, int start, int middle, int end) {
		int length=end-start+1; //������ �κ��� ���̸� ���Ѵ�.
		int[] temp= new int[length]; //���� ����� ������ �ӽ� �迭�� �����Ѵ�.
		int i=0; //�ӽ� �迭�� ���� �ε���
		int index1=start; //�պκп� ���� �ε���
		int index2=middle+1; //�޺κп� ���� �ε���
		
		//������ ���� �պκа� �޺κп� �Ѵ� ����������
		while(index1<=middle && index2<=end) { 
			if(a[index1]<a[index2]) //�պκа� �޺κ��� ���� ���� ���Ͽ�
				temp[i++]=a[index1++]; // �� ���� ���� �ӽ� �迭�� ���� ����.
			else
				temp[i++]=a[index2++];
		}
		
		//�պκ� �迭�� �����ִ� ���� �ӽ� �迭�� �ִ´�.
		while(index1<=middle)
			temp[i++]=a[index1++];
		
		//�޺κ� �迭�� �����ִ� ���� �ӽ� �迭�� �ִ´�.
		while(index2<=end)
			temp[i++]=a[index2++];
		
		//�ӽ� �迭�� ������ a �迭�� start ��ġ�� �����Ѵ�.
		for(i=0; i<temp.length; i++) {
			a[start+i]=temp[i];
		}
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		Scanner src = new Scanner(System.in);
		
		System.out.print("�迭�� ���̸� �Է��Ͻÿ�. ");
		int length=src.nextInt();
		
		int[] a = new int[length];
		
		for(int i=0; i<length; i++) {
			a[i]=random.nextInt(100);
		}
		
		System.out.println("���� �� �迭 : "+Arrays.toString(a));
		mergeSort(a, 0, a.length-1);
		System.out.println("���� �� �迭 : "+Arrays.toString(a));
	}
}
