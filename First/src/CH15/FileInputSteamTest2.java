package CH15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputSteamTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(FileInputStream fis = new FileInputStream("aaa.txt")) {
	int i;
	while((i = fis.read()) != -1) {
		System.out.println((char)i);
	}
	System.out.println("end");
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}
	}

}
