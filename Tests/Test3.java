import java.util.Scanner;
import java.io.*;
public class Test3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int dices = 0;
		int tries;
		int range=0;
		String Upper = "Upper half";
		String Lower = "Lower half";
		
		
		System.out.println("Hello we are going to play a game. Please enter in the number of times you would like to play:");
		tries = input.nextInt();
		int[] score = new int[tries];
		int[] Numguess = new int[tries];
		int[] roll = new int[tries];
		String[] guess = new String[tries];
		System.out.println("Please enter the number of dice you would like to be rolled");
		dices = input.nextInt();
		Test3Dice CompRoll = new Test3Dice(tries);
		for (int i=0; i<tries; i++){
			roll[i]= CompRoll.result();
			
			
			
			if (roll[i]>dices*3){
				range = 2;
			}
			else {
				range = 1;
			}
			if (i==0) {
				System.out.println("In this game you will enter high or low to guess whether the dice rolled a total in the high range or "
					+ "low range. \nThe low range represents the bottom half of possible rolls and the upper represents the upper half.\n");
			}
			System.out.println("Press 1 for low range and 2 for upper range:");
			System.out.printf("roll:%d, #dice:%d, range:%d",roll[i],dices,range);
			System.out.println(range);
			Numguess[i]= input.nextInt();
			if (Numguess[i] == 1){
				guess[i]= Lower;
			}
			else {
				guess[i]=Upper;
			}
			if (Numguess[i]==range){
				System.out.println("Congrats you chose right!!!");
				if (i<1){
					score[i]=1;
				}
				else{
					score[i]=score[i-1] +1;
				}
			}
			else{
				System.out.println("Sorry you chose wrong...");
				if (i<1){
					score[i]=-1;
				}
				else{
					score[i]=score[i-1] -1;
				}
			}
			
		}
		for (int j = 0; j<tries; j++){
			
			System.out.printf("Computer's roll:     %d    Your Guess: %s     Your Current Score: %d\n", roll[j],guess[j], score[j]);
		}
		System.out.printf("End Score:    %d", score[tries-1]);
	}
}
