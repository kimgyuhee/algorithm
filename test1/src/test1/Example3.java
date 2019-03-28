package test1;

public class Example3 {

	static void FF(int[][] a, int r, int c) { 
		if (r >= a.length) return; 
		if (c >= a[r].length) return; 
		System.out.printf("%d ", a[r][c]); 
		FF(a, r, c + 1); 
		FF(a, r + 1, c); 
	} 


	static int GG(int[] a, int value, int start, int end) { 
		if (start > end) return -1; 
		int middle = (start + end) / 2; 
		System.out.printf("%d ", middle); 
		if (a[middle] < value) start = middle + 1; 
		else if (a[middle] > value) end = middle - 1; 
		else return middle; 
		return GG(a, value, start, end); 
	} 


	static void swap(int[] a, int i, int j) { 
		int temp = a[i]; 
		a[i] = a[j]; 
		a[j] = temp; 
	} 

	static void print(int[] a) { 
		for (int i = 0; i < a.length; ++i) 
			System.out.printf("%d ", a[i]); 
		System.out.println(); 
	} 

	static void HH(int[] a) { 
		for (int i = a.length - 1; i > 1; --i) { 
			for (int j = 0; j < i; ++j) { 
				if (a[j] > a[j + 1]) { 
					swap(a, j, j + 1); 
				} 
			} 
		} 
	}
	
	static void II(int[] a) { 
		for (int i = 1; i < a.length; ++i) { 
			int value = a[i]; 
			int j; 
			for (j = i - 1; j > 0; --j) 
				if (a[j] > value) 
					a[j + 1] = a[j]; 
				else break; 
			a[j + 1] = value; 
		} 
	} 

	static int partition(int[] a, int start, int end) { 
		int value = a[end]; 
		int i = start - 1; 
		for (int j = start; j < end - 1; ++j) 
			if (a[j] < value) 
				swap(a, ++i, j); 
		swap(a, i + 1, end); 
		return i + 1; 
	} 

	static void JJ(int[] a, int start, int end) { 
		if (start >= end) return; 
		int middle = partition(a, start, end); 
		JJ(a, start, middle-1); 
		JJ(a, middle+1, end); 
	} 

	static int KK(int n) { 
		if (n <= 1) return 1; 
		return KK(n - 1) + KK(n - 2); 
	} 

	static int LL(int n) { 
		int sum = 0; 
		for (int i = 0; i < 100 - n; ++i) 
			sum += i; 
		return sum; 
	}

	public static void main(String[] args) {


		// TODO Auto-generated method stub
		int[][] f = {{1, 2}, {3, 4}}; 
		FF(f, 0, 0); System.out.println(); // ok

		int[] g = {1, 2, 3, 4, 5}; 
		GG(g, 2, 0, 4);            // ok
		System.out.println(); 

		int[] h = {4, 5, 3, 2}; 
		HH(h); print(h); // ok 

		int[] i = {4, 5, 3, 2}; 
		II(i); print(i); // ok

		int[] j = {2, 5, 3, 4}; 
		JJ(j, 0, 3); print(j); // ok 

		System.out.println(KK(5));

	}
}
