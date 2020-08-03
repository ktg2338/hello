package ch07;

public class TwoD {
	public static void main(String[]args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2 = new int[2][3];
		
		int count = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
//				System.out.println(arr[i][j]);
				arr2[i][j] = count++;
				System.out.println(arr2[i][j]);
			}
			System.out.println();
		}
	}
}
