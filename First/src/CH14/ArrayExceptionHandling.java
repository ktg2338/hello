package CH14;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int[] arr1 = {1, 2, 0, 4, 5};
		try {
			for(int i = 0; i<=5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
				System.out.println(arr[i]/arr1[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("예외 처리 부분");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("0으로 나눈 오류");
			return;
		} finally {
			System.out.println("실행");
		}
		System.out.println("프로그램 종료");
	}

}
