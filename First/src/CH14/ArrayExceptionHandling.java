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
			System.out.println("���� ó�� �κ�");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("0���� ���� ����");
			return;
		} finally {
			System.out.println("����");
		}
		System.out.println("���α׷� ����");
	}

}
