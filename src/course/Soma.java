package course;

public class Soma {
	double numberOne, numberTwo, numberThree;
	
	public void setNumberOne (double numberOne) {
		this.numberOne = numberOne;
	}
	
	public void setNumberTwo (double numberTwo) {
		this.numberTwo = numberTwo;
	}
	
	public void setNumberThree (double numberThree) {
		this.numberThree = numberThree;
	}
	
	public double somar () {
		System.out.print("A soma entre: " + numberOne + ", " + numberTwo + ", " + numberThree + " é: ");
		return numberOne + numberTwo + numberThree;
		
	}
	
}
