package CH13.lamda;
interface MyNumber{
	int getMax(int num1, int num2);
}
public class TestMyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber max = (x,y) -> { return (x>= y) ? x:y; };
		System.out.println(max.getMax(10, 20));
	}

}
