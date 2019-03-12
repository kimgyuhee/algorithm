package hw2_1;

public class Example7 {

	static void print1(int[][] a) {
		for(int i=0; i<a.length; i++) {
			for(int j =0; j<a[i].length; j++)
				System.out.printf("%d ", a[i][j]);
			System.out.println();
		}
	}

	 //출력은 되지만 오류
	static void print2(int[][] a, int i, int j) {
		if(a[i].length==j) {
			j=0;
			i++;
			System.out.println();
		}
		System.out.printf("%d ", a[i][j]);
		print2(a, i, ++j);
	}
	
	
	static void print3(int[][] a, int i, int j) {
		if(i<a.length) {
			System.out.printf("%d ", a[i][j]);
			if(j < a[i].length-1) {
				print3(a, i, ++j);
			}else {
				System.out.println();
				print3(a, ++i, 0);
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[][] a = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}};
		print1(a);
		System.out.println();
		print3(a, 0, 0);
		System.out.println();
		print2(a, 0, 0);
	}
}
