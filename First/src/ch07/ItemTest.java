package ch07;

public class ItemTest{
	public static void main(String[] args) {
		Item strom = new Item("���� �극��Ŀ", 600);
		Item gauntlet = new Item("���Ǵ�Ƽ ��Ʋ��", 999);
		Item bow = new Item("ȣũ������ Ȱ",50);
		Item shield = new Item("ĸ�� ����", 50);

		Item[] Items = {strom, gauntlet, bow, shield};
		System.out.println(Items);
		for(int i=0; i<Items.length; i++) {
			System.out.println(Items[i].toString());
			}
	}
}

class Item{
	String name;
	int power;
	
	public Item(String str, int i) {
		name = str;
		power = i;
		}
	
	public String toString() {
		return String.format("ITEM {name: %s, power: %d }", name,power);	
			}
	}