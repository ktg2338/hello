package ch06;

	class Person{
		String name;
		int age;
		Person(){
			this("�̸� ����" , 1);
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
		// This�� �ٸ� ������ ȣ�� �ϱ�
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		noName.returnItself();
		
		Person p = noName.returnItself();
		System.out.println(p);
		System.out.println(noName);
		p.name = "���̸�";
		System.out.println(noName.name);
		
	}
}
