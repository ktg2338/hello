package CH12.generics;

public class GenericPrinter<T extends Material> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T gerMaterial() {
		return material;
	}
	public String toString() {
		return material.toString();
		}
	}

