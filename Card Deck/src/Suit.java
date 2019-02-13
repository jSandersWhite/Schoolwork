
public enum Suit {

	HEARTS("Hearts", '\u2665'), DIAMONDS("Diamonds", '\u2666'), CLUBS("Clubs", '\u2663'), SPADES("Spades", '\u2660');
	
	private final String name;
	private final char symbol;
	
	private Suit (String newName, char newSymbol) {
		this.name = newName;
		this.symbol = newSymbol;
	} // end bracket of constructor
	
	public String getName() {
		return this.name;
	} // end bracket of method getName
	
	public char getSymbol() {
		return this.symbol;
	} // end bracket of method getSymbol
	
} // end bracket of enum Suit
