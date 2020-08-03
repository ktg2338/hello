package CH12.generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		Plastic p1 = new Plastic();
		plasticPrinter.setMaterial(p1);
		Plastic plastic = plasticPrinter.gerMaterial();
		System.out.println(plasticPrinter);
		}

}
