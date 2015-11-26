import java.util.Scanner;
public class Lab4 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ThreeDice dice = new ThreeDice();
		Test3Dice dice2 = new Test3Dice();
		
		System.out.println("Current class: "+dice.Throw());
		System.out.println("Parent Class: " +dice2.Throw());
	}
}
