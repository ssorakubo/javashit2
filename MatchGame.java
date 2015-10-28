package pack1;

import java.util.Scanner;

public class MatchGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String theWord;

		// Get the word from the first player.
		System.out.print("Enter the word to be guessed: ");
		theWord = scan.next();

		while (theWord.length() != 3) {
			System.out
					.print("The word must be three characters long. Please try again: ");
			theWord = scan.next();
		}

		// Clear the Screen
		int lineCounter = 0;
		while (lineCounter < 50) {
			System.out.println();
			lineCounter = lineCounter + 1;
		}

		// Play the game with the second player.
		int count = 1;
		String guess;
		System.out.print("Enter Your Guess: ");
		guess = scan.next();

		// while the second player still has not guessed the word and has some
		// tries left
		while (count < 5 && !guess.equals(theWord)) {
			System.out.print("Enter Another Guess: ");
			guess = scan.next();
			count = count + 1;
		}

		// check if second player won
		if (guess.equals(theWord))
			System.out.println("You Won!");
		else
			System.out.println("You Lost!");

	}
}