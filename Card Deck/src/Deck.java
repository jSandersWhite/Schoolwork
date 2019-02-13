import java.util.Random;

public class Deck {

	private static Card[] cards;
	private static final int DECK_SIZE = 52;
	private static Random randomizer;
	private static int numberOfCardsRemaining;
	
	public Deck() {
		int arrayIndex = 0;
		Deck.cards = new Card[DECK_SIZE];
		Deck.numberOfCardsRemaining = DECK_SIZE;
		Deck.randomizer = new Random();
		
		for(Suit suit : Suit.values()) {
			for(Rank rank : Rank.values()) {
				Deck.cards[arrayIndex++] = new Card(rank, suit);
			} // end bracket of inner for loop - Rank
		} // end bracket of outer for loop - Suit
	} // end bracket of constructor
	
	public Card deal() {
		Card rv = null;
		
		int index = 0;
		
		do {
			index = randomizer.nextInt(DECK_SIZE);
			rv = cards[index];
		} while (rv == null);
		
		cards[index] = null;
		Deck.numberOfCardsRemaining--;
		return rv;
	} // end bracket of method deal
	
	public int getNumberOfCardsRemaining() {
		return Deck.numberOfCardsRemaining;
	} // end bracket of method getNumberOfCardsRemaining
	
	public void displayDeck() {
		for(Card a_Card : Deck.cards) {
			System.out.println(a_Card.toString());
		} // end bracket of for loop - Cards
	} // end bracket of method displayDeck
	
	public void displayDeckSymbols() {
		for(Card a_Card : Deck.cards) {
			System.out.println(a_Card.toStringSymbol());
		} // end bracket of for loop - Cards
	} // end bracket of method displayDeckSymbols
	
	
	
	
} // end bracket of class Deck
