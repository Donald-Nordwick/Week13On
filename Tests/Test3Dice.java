import java.io.IOException;

public class Test3Dice {

	private int dices;					//keeps value for dices for class
	public Test3Dice(){
	}
	public Test3Dice(int dices) throws IOException{
		
		if ( dices<=0){
			throw new IOException();
		}
		else{
			this.dices = dices;		
			}
		
	}
	public int result(){				//returns total dice roll
		int total = 0;
		for (int i =0; i<dices; i++){
			int roll =  + (int)(Math.random()*6);
			total = total + roll;
		}
		return total;
	}
	public int Throw(){
		int roll = 1 +(int)(Math.random()*6);
		return roll;
	}
}
