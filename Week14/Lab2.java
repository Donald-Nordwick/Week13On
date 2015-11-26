import java.util.Scanner;
public class Lab2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ThreeDice dice = new ThreeDice();
		int result = dice.Throw();
		System.out.println(result);
		System.out.println("dice.toString()");
		System.out.println(dice.toString());
		System.out.println(dice);
	}
}
