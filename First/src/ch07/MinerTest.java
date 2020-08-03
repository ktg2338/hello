package ch07;

public class MinerTest{
	public static void main(String[] args) {
		Miner bitcoin = new Miner("��Ʈ����");
		Miner etherium = new Miner("�̴�����");
	
		System.out.println(bitcoin.toString());
		System.out.println(etherium.toString());
		bitcoin.mine();bitcoin.mine();bitcoin.mine();bitcoin.mine();bitcoin.mine();
		bitcoin.mine();bitcoin.mine();bitcoin.mine();bitcoin.mine();bitcoin.mine();
		etherium.mine();etherium.mine();etherium.mine();
		System.out.println(bitcoin.toString());
		System.out.println(etherium.toString());
		for(int i = 0; i < 10000; i++) {
			bitcoin.mine();
		}System.out.println(bitcoin.toString());
	}
	
}

class Miner{
	String name;
	int coins = 0;
	
	public Miner(String name) {
		this.name = name;
	
		}
	public String toString() {
		return String.format("Miner{name: %s, ����: %d ��}", name, coins);	
			}
	public void mine() {
		coins += 1;
	}
}