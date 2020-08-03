package ch08;

public class Main1 {
	  public static void main (String[] args) {
	    // 객체 생성
	    Car c = new Car("티코");
	    Car t = new Truck("봉고", 1.5);
	    
	    // 정보 출력
	    System.out.println(c.toString());
	    System.out.println(t.toString());
	  }
	}

	class Car {
	  protected String name;
	  
	  public Car(String name) {
	    this.name = name;
	  }

	  public String toString() {
	    return String.format("[자동차] { name: %s }", name);
	  }
	}

	class Truck extends Car {
	  protected double ton; // 적재량
	  
	  public Truck(String name, double ton) {
		  super(name);
	    this.ton = ton;
	  }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[자동차] { name: %s, ton: %s }", name, ton);
	}
	  
	}