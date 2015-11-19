
public class Test3Dice {

	private int dices;					//keeps value for dices for class
	public Test3Dice(int diceamt){
		dices = diceamt;
	}
	public int result(){				//returns total dice roll
		int total = 0;
		for (int i =0; i<dices; i++){
			int roll =  + (int)(Math.random()*6);
			total = total + roll;
		}
		return total;
	}
}
