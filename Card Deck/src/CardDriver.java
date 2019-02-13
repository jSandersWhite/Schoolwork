
public class CardDriver {

	public static void main(String args[]) {
		

		Card card1 = new Card(Rank.ACE, Suit.SPADES);
		
		System.out.println(card1.toStringSymbol());
		
		Card card2 = new Card(Rank.KING, Suit.CLUBS);
		
		System.out.println(card2.toStringSymbol());
		
		Card card3 = new Card(Rank.QUEEN, Suit.HEARTS);
		
		System.out.println(card3.toStringSymbol());
		
		Card card4 = new Card(Rank.JACK, Suit.DIAMONDS);
		
		System.out.println(card4.toStringSymbol()); 
	} // end bracket of method main
	
} // end bracket of method CardDriver
