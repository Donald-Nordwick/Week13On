import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class Test3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueLoop = true;
		int dices = 0; // Initializes how many dices for the game
		int tries = 0; // Initializes how many tries the user wants to do
		int range = 0; // represents upper and lower range. 1 is lower and 2 is
						// upper
		String Upper = "Upper half";
		String Lower = "Lower half";

		do {
			try {
				continueLoop = true;
				System.out.println(
						"Hello we are going to play a game. Please enter in the number of times you would like to play:");
				tries = input.nextInt();
				continueLoop = false;
			} catch (Exception e) {
				System.out.println("Sorry, the entry you put in was not a number");
				input.nextLine();
			}
		} while (continueLoop);
		continueLoop = true;
		int[] score = new int[tries]; // keeps track of user score
		int[] Numguess = new int[tries]; // keeps track of user guess
		int[] roll = new int[tries]; // keeps track of computer rolls
		String[] guess = new String[tries]; // represents user guess in string
											// form
		do {
			try {
				continueLoop = true;
				System.out.println("Please enter the number of dice you would like to be rolled");
				dices = input.nextInt(); // user assigns how many dices
				Test3Dice CompRoll = new Test3Dice(dices); // constructor takes
															// how many dices.
				for (int i = 0; i < tries; i++) {
					roll[i] = CompRoll.result();

					if (roll[i] > dices * 3) {
						range = 2;
					} else {
						range = 1;
					}
					if (i == 0) {
						System.out.println(
								"In this game you will enter high or low to guess whether the dice rolled a total in the high range or "
										+ "low range. \nThe low range represents the bottom half of possible rolls and the upper represents the upper half.\n");
					}
					// user enters answer
					do {
						try {
							continueLoop = true;
							System.out.println("Press 1 for low range and 2 for upper range:");
							System.out.printf("roll:%d, #dice:%d, range:%d", roll[i], dices, range); // for
																										// debug
							Numguess[i] = input.nextInt();
							continueLoop = false;
						}catch (RuntimeException f) {
							System.out.println("Sorry, the engry you put was not a number.");
						}
					} while (continueLoop);
					if (Numguess[i] == 1) { // if statement assigns user answer
											// to string form
						guess[i] = Lower;
					} else {
						guess[i] = Upper;
					}
					if (Numguess[i] == range) {
						System.out.println("Congrats you chose right!!!"); // evaluates if user guessed right or not
						if (i < 1) {
							score[i] = 1; // assigns the user score
						} else {
							score[i] = score[i - 1] + 1;
						}
					} else {
						System.out.println("Sorry you chose wrong...");
						if (i < 1) {
							score[i] = -1;
						} else {
							score[i] = score[i - 1] - 1;
						}
					}

				}
				for (int j = 0; j < tries; j++) { // loop will display game
													// history

					System.out.printf("Computer's roll:     %d    Your Guess: %s     Your Current Score: %d\n", roll[j],
							guess[j], score[j]);
				}
				System.out.printf("End Score:    %d", score[tries - 1]); // loop
																			// will
																			// display
																			// final
																			// score
				continueLoop = false;
			} catch (Exception e) {
				System.out.println("Sorry, the entry you put in was invalid");
				input.nextLine();
			} 
		} while (continueLoop);

	}	
}
