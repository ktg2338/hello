package CH13.lamda;

interface StringConcat {
	public void makeString(String s1, String s2);
}

class StringConcatImpl implements StringConcat {
	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + "," + s2);
	}
}
public class TestStringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "��ο�";
		String s2 = "���� !";
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);
		StringConcat concat2 = (s, v) ->System.out.println(s + "," +v);
		concat2.makeString(s1, s2);
	}

}
