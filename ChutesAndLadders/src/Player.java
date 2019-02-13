public class Player {
	
	private String name;
	private int currentSquareNumber;
	
	public Player(String newName) {
		this.name = newName;
		this.currentSquareNumber = 1;
	} // end bracket of constructor
	
	public void updateCurrentSquareNumber(int update) {
		this.currentSquareNumber += update;
	} // end bracket of method updateCurrentSquareNumber
	
	public int getCurrentSquareNumber() {
		return this.currentSquareNumber;
	} // end bracket of method getCurrentSquareNumber
	
	public String getName() {
		return this.name;
	} // end bracket of method getName
	
	} // end bracket of class Player