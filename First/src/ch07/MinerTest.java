package ch07;

public class MinerTest{
	public static void main(String[] args) {
		Miner bitcoin = new Miner("비트코인");
		Miner etherium = new Miner("이더리움");
	
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
		return String.format("Miner{name: %s, 갯수: %d 개}", name, coins);	
			}
	public void mine() {
		coins += 1;
	}
}