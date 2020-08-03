package chQ06;

class Card{
	public static int serialN = 1000;
	public int CardN;
	
	public int getcardN() {
		return CardN;
	}
	public void setcardN(int x) {
		CardN = x;
	}
}
	
public class Q5 {

	public static void main(String[] args) {
		Card card1 = new Card();
		card1.setcardN(7587);
		System.out.println(card1.CardN);
		System.out.println(card1.serialN);
		card1.serialN++;
		
		Card card2 = new Card();
		card2.setcardN(5437);
		System.out.println(card2.CardN);
		System.out.println(card2.serialN);
		card1.serialN++;

	}

}
