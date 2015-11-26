
public class ThreeDice extends Test3Dice {
	private int lastRoll= 0;
public int Throw(){
	int total = 0;
	int average = 0;
	for (int i =0; i<3;i++){
	total = total +super.Throw();
	}
	average = total/3;
	return average;
}
public String toString(){
	this.Throw();
	String response;
	response ="This is the Three Dice Class and your last roll was ";
	response = response + lastRoll;
	return response;
}
}
