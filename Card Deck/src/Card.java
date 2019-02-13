
public class Card {

	private final Rank rank;
	private final Suit suit;
	
	public Card(Rank newRank, Suit newSuit) {
		this.rank = newRank;
		this.suit = newSuit;
	} // end bracket of constructor
	
	public Rank getRank() {
		return this.rank;
	} // end bracket of method getRank
	
	public Suit getSuit() {
		return this.suit;
	} // end bracket of method getSuit
	
	public String toString() {
		return this.rank.getRank() + " of " + this.suit.getName();
	} // end bracket of method toString
	
	public String toStringSymbol() {
		return this.rank.getSymbol() + "" + this.suit.getSymbol();
	} // end bracket of method toStringSymbol
	
} // end bracket for class Card
