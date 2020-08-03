package ch07;

public class EnhancedForLoop {
	public static void main(String[]args) {
		String[] strArr = {"Java","Android","C","Javascript","Python"};
		for(String x : strArr) {
			System.out.println(x);
		}
		int [] numArr = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for(int x : numArr) {
			sum += x;
			System.out.println(x);
			}
	}
}
