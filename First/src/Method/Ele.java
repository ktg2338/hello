package Method;

public class Ele {
	public static void main(String[] args) {
	int a = 13;
	int b = 7;
	int c = 10;
	
	System.out.printf("%dÃş ´Â %S ¿¤¸®º£ÀÌÅÍ\n" , a, guide(a));
	System.out.printf("%dÃş ´Â %S ¿¤¸®º£ÀÌÅÍ\n" , b, guide(b));
	System.out.printf("%dÃş ´Â %S ¿¤¸®º£ÀÌÅÍ\n" , c, guide(c));
	}
	  
	public static String guide(int x){
		if(x > 10)
			return "°íÃş";
		else
			return "ÀúÃş";
	}
}

