package codility;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[5];
		int[] m = new int[] {3,4,4,6,1,4,4};
		
		int max=0;
		
		for(int i=0; i<m.length; i++) {
			if(n.length>=m[i]) {
				n[m[i]-1]++;
			}else {
				for(int j=0; j<n.length; j++) {
					if(max<n[j])
						max=n[j];
				}
				for(int j=0; j<n.length; j++)
					n[j]=max;
			}
			for(int j=0; j<n.length; j++) {
				System.out.printf("%d ", n[j]);
			}
			System.out.println();
		}
		
		
	}

}
