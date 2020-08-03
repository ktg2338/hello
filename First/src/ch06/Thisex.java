package ch06;

	class Person{
		String name;
		int age;
		Person(){
			this("이름 없음" , 1);
		}
		Person(String name, int age){
			this.name = name;
			this.age = age;
		}
		Person returnItself() {
			return this;
		}
	}

public class Thisex {
	public static void main(String[] args) {
		// This로 다른 생성자 호출 하기
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		noName.returnItself();
		
		Person p = noName.returnItself();
		System.out.println(p);
		System.out.println(noName);
		p.name = "내이름";
		System.out.println(noName.name);
		
	}
}
