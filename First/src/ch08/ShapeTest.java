package ch08;

import java.util.ArrayList;

class ShapeTest {
	public void draw() {
		System.out.println("Shape");
	}
}

class Circle extends ShapeTest {
	public void draw() {
		System.out.println("Circle");
	}
}

class Triangle extends ShapeTest {
	public void draw() {
		System.out.println("Triangle");
	}
}

public class ShapeTest {
	public static void main(String[] args) {
		ArrayList<ShapeTest> list = new ArrayList<ShapeTest>();
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new ShapeTest());
		for (ShapeTest s : list) {
			s.draw();
		}
	}
}
