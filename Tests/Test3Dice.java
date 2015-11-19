import java.util.Random;
public class Test3Dice {
	Random rn = new Random();
	private int dices;
	public Test3Dice(int diceamt){
		dices = diceamt;
	}
	public int result(){
		int total = 0;
		for (int i =0; i<dices; i++){
			int roll =  + (int)(Math.random()*6);
			total = total + roll;
		}
		return total;
	}
}
