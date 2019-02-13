import java.util.Random;

public class Spinner {
	
	private int value;
	Random randomizer = new Random();
	
	public Spinner() {
	} // end bracket of constructor
	
	public int spin() {
		this.value = randomizer.nextInt(6) + 1;
		return this.value;
	} // end bracket of method spin
	
	public int getValue() {
		return this.value;
	} // end bracket of method getValue
	
} // end bracket of class Spinner
	