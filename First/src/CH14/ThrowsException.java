package CH14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
	FileInputStream fis = new FileInputStream(fileName);
	Class c = Class.forName(className);
	return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThrowsException test = new ThrowsException();
try {
	test.loadClass("a.txt", "java.lang.String");
} catch (FileNotFoundException e) {
	System.out.println(e);
	System.out.println(" 파일 못참");
} catch (ClassNotFoundException e) {
	System.out.println(e);
	System.out.println(" 클래스 못찾");
}
}

}
