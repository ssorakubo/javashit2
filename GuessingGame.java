package pack1;

import java.util.*;

public class GuessingGame {
	public static void main(String[] args) {
		int firstInt, i;
		Scanner scan = new Scanner(System.in);
		i = 1;
		Random rand = new Random();
		int val = rand.nextInt(9) + 1;
		System.out.println("I am thinking of a number from 1 to 10.");
		System.out.println("You must guess what it is in three tries.");
		while (i <= 3) {
			System.out.println("Enter a guess:");
			firstInt = scan.nextInt();
			if (firstInt != val) {
				System.out.println("Wrong");
			} else {
				System.out.println("Right");
				System.out.println("You have won the game");
				System.exit(0);
			}
			i++;
		}
		System.out.println("The correct number was " +val);
		System.out.println("You loser");
		
	}
}