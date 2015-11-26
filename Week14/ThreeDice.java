
public class ThreeDice {
public int Throw(){
	int result = 0;
	Test3Dice D1 = new Test3Dice();
	Test3Dice D2 = new Test3Dice();
	Test3Dice D3 = new Test3Dice();
	result = D1.Throw() + D2.Throw() + D3.Throw();
	return result;
}
}
