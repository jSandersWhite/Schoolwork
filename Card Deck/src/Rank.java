
public enum Rank {

	DEUCE("Duece", '2'), TREY("Trey", '3'), FOUR("Four", '4'), FIVE("Five", '5'), SIX("Six", '6'),
	SEVEN("Seven", '7'), EIGHT("Eight", '8'), NINE("Nine", '9'), TEN("Ten", 'T'), JACK("Jack", 'J'),
	QUEEN("Queen", 'Q'), KING("King", 'K'), ACE("Ace", 'A');
	
	private final String rank;
	private final char symbol;
	
	private Rank (String newRank, char newSymbol) {
		this.rank = newRank;
		this.symbol = newSymbol;
	} // end bracket of constructor
	
	public String getRank() {
		return this.rank;
	} // end bracket of method getRank
	
	public char getSymbol() {
		return this.symbol;
	} // end bracket of method getSymbol
	
} // end bracket of enum Rank
