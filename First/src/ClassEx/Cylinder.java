package ClassEx;

public class Cylinder {

	public static void main(String[] args) {
		Circle c = new Circle();
		Circle a = new Circle();
		a.radious = 99;
		a.height = 150;
		c.radious = 4;
		c.height = 5;

		System.out.printf("¿ø±âµÕÀÇ ºÎÇÇ: %.2f\n", c.getV());
		System.out.printf("¿ø±âµÕÀÇ °Ñ³ÐÀÌ: %.2f\n", c.getA());
		System.out.printf("¿ø±âµÕÀÇ ºÎÇÇ: %.2f\n", a.getV());
		System.out.printf("¿ø±âµÕÀÇ °Ñ³ÐÀÌ: %.2f\n", a.getA());
	}
}

class Circle{
	int radious;
	int height;

	double getV() {
		return (radious*radious*Math.PI)*height;
		}
	double getA() {
		return 2*((radious*radious*Math.PI)+ (radious*Math.PI*height));
		}
}