package ch07;

public class ItemTest{
	public static void main(String[] args) {
		Item strom = new Item("스톰 브레이커", 600);
		Item gauntlet = new Item("인피니티 건틀렛", 999);
		Item bow = new Item("호크아이의 활",50);
		Item shield = new Item("캡아 방패", 50);

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