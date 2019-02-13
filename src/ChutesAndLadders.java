// Joshua White
// Project 10
// Due 11/14/17
// Completed 11/11/17
// Chutes and Ladders game

import java.util.Scanner;

public class ChutesAndLadders {
	
	public static void main(String[] args) {
		
		// Initialize input stream object
		Scanner kb = new Scanner(System.in);
		
		Spinner spinner = new Spinner();
		
		System.out.println("Chutes and Ladders! \nEnter Player One's name: ");
		Player player1 = new Player(kb.nextLine());
		System.out.println("Enter Player Two's name: ");
		Player player2 = new Player(kb.nextLine());
		
		do {
			playerMove(player1, spinner);
			if (player1.getCurrentSquareNumber() != 100) {
				playerMove(player2, spinner);
	
				System.out.println("\n" + player1.getName() + " is at square " + player1.getCurrentSquareNumber());
				System.out.println(player2.getName() + " is at square " + player2.getCurrentSquareNumber());
			} // end if (player1.getCurrentSquareNumber())
			char nextTurn = ' ';
			if (player1.getCurrentSquareNumber() != 100 && player2.getCurrentSquareNumber() != 100) {
				do {
					System.out.println("Enter 'y' to take the next turn.");
					nextTurn = Character.toLowerCase(kb.next().charAt(0));
				} while (nextTurn != 'y');
			} // end if (player1.getCurrentSquareNumber()...)
		} while (player1.getCurrentSquareNumber() != 100 && player2.getCurrentSquareNumber() != 100);
		
		if (player1.getCurrentSquareNumber() == 100) {
			System.out.println(player1.getName() + " wins!");
		} else {
			System.out.println(player2.getName() + " wins!");
		} // end bracket of if (player1.getCurrentSquareNumber)
			
		// close input stream object
		kb.close();
	} // end bracket of method main
	
	private static void playerMove(Player player, Spinner spinner) {
		spinner.spin();
		player.updateCurrentSquareNumber(spinner.getValue());
		if (player.getCurrentSquareNumber() > 100) {
			player.updateCurrentSquareNumber(-spinner.getValue());
			System.out.println(player.getName() + "'s spin! You spun a " + spinner.getValue() + " and went over 100! You don't move.");
		} else {
			System.out.println(player.getName() + "'s spin! \nYou spun a " + spinner.getValue() + " and move to square " + player.getCurrentSquareNumber() + ".");
		} // end if (player.getCurrentSquareNumber > 100)

			// Ladder squares
		if (player.getCurrentSquareNumber() == 1) {
			System.out.println("You started a garden, and now have beautiful flowers! \nLadder up to square 38.");
			player.updateCurrentSquareNumber(37);
		} else if (player.getCurrentSquareNumber() == 4) {
			System.out.println("You started to bake a delicious cake, and everyone got to eat it! \nLadder up to square 14.");
			player.updateCurrentSquareNumber(10);
		} else if (player.getCurrentSquareNumber() == 9) {
			System.out.println("You did your chores and mowed the lawn, now you get to go to the fair and have fun! \nLadder up to square 31.");
			player.updateCurrentSquareNumber(22);
		} else if (player.getCurrentSquareNumber() == 21) {
			System.out.println("You put a bandage on a hurt pet, it is back to being healthy and happy! \nLadder up to square 42.");
			player.updateCurrentSquareNumber(21);
		} else if (player.getCurrentSquareNumber() == 28) {
			System.out.println("You rescued a cat from a tree, you now have a new best friend! \nLadder up to square 84.");
			player.updateCurrentSquareNumber(56);
		} else if (player.getCurrentSquareNumber() == 36) {
			System.out.println("You ate a healthy breakfast and will grow up tall and strong. \nLadder up to square 44.");
			player.updateCurrentSquareNumber(8);
		} else if (player.getCurrentSquareNumber() == 51) {
			System.out.println("You swept and cleaned the house, now you get to go to the movies! \nLadder up to square 67.");
			player.updateCurrentSquareNumber(16);
		} else if (player.getCurrentSquareNumber() == 71) {
			System.out.println("You returned a missing purse, and the nice lady bought you ice cream as a reward! \nLadder up to square 91.");
			player.updateCurrentSquareNumber(20);
		} else if (player.getCurrentSquareNumber() == 80) {
			System.out.println("You won the award, ladder up to square 100!!");
			player.updateCurrentSquareNumber(20);
		} // end bracket of if(player.getCurrentSquareNumber())
	
		// chute squares
		if (player.getCurrentSquareNumber() == 98) {
			System.out.println("You pulled a cat's tail and it scratched you! \nChute down to square 78.");
			player.updateCurrentSquareNumber(-20);
		} else if (player.getCurrentSquareNumber() == 95) {
			System.out.println("You broke a mirror. You have to empty your piggy bank to pay for it. \nChute down to square 75.");
			player.updateCurrentSquareNumber(-20);
		} else if (player.getCurrentSquareNumber() == 93) {
			System.out.println("You drew on the wall, now you have to scrub it off. \nChute down to square 73.");
			player.updateCurrentSquareNumber(-20);
		} else if (player.getCurrentSquareNumber() == 87) {
			System.out.println("You peeked in the cookie jar, but you knocked it over. \nChute down to square 24.");
			player.updateCurrentSquareNumber(-63);
		} else if (player.getCurrentSquareNumber() == 64) {
			System.out.println("You were careless riding your bicycle and fell and hurt your arm. \nChute down to square 60.");
			player.updateCurrentSquareNumber(-4);
		} else if (player.getCurrentSquareNumber() == 62) {
			System.out.println("You dropped and broke a pile of plates. \nChute down to square 19.");
			player.updateCurrentSquareNumber(43);
		} else if (player.getCurrentSquareNumber() == 56) {
			System.out.println("You played in the rain without wearing your rain coat, now you caught a cold. \nChute down to square 53.");
			player.updateCurrentSquareNumber(-3);
		} else if (player.getCurrentSquareNumber() == 49) {
			System.out.println("You ate an entire box of cookies, now you don't feel good. \nChute down to square 11.");
			player.updateCurrentSquareNumber(-38);
		} else if (player.getCurrentSquareNumber() == 47) {
			System.out.println("You were skating on thin ice and fell through. \nChute down to square 26.");
			player.updateCurrentSquareNumber(-21);
		} else if (player.getCurrentSquareNumber() == 16) {
			System.out.println("You were reading comics instead of your textbook. Now you must wear the cone of shame. \nChute down to square 6.");
			player.updateCurrentSquareNumber(-10);
		} // end bracket of if (player.getCurrentSquareNumber())
		
	} // end method playerMove
	
}// end bracket of class ChutesAndLadders




