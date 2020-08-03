package CH14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
try {
	fis = new FileInputStream("a.txt");
} catch (FileNotFoundException e) {
	// TODO: handle exception
System.out.println(e);
}
if(fis != null) {
	
try {
	fis.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println(e);
}
}
System.out.println("여기도 수행이 됨");
	}

}
