
public class DeckDriver {
	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		do{
			System.out.print(deck.getNumberOfCardsRemaining() + ": ");
			System.out.println(deck.deal().toStringSymbol());
		} while(deck.getNumberOfCardsRemaining() != 0);
	}// end bracket of method main
} // end bracket of class DeckDriver
