package ch07;

public class CubeTest{
	public static void main(String[] args) {
		Cube a = new Cube(3);
		Cube b = new Cube(5);

		System.out.printf("¡§¿∞∏È√º a¿« ∫Œ«« : %d, ∞—≥–¿Ã : %d\n", a.V(), a.A());
		System.out.printf("¡§¿∞∏È√º b¿« ∫Œ«« : %d, ∞—≥–¿Ã : %d\n", b.V(), b.A());
	}
}

class Cube{
	int length;
	
	public Cube(int length) {
		this.length = length;
		}
	
	public int V() {
		return length*length*length;	
			}
	public int A() {
		return 6*length*length;	
			}
}