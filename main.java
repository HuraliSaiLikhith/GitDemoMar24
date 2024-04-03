public class main {
	public static void main(String[] args){

		System.out.println("Hello World");
		System.out.println("Addition" + Calculator.add(10, 15));
		System.out.println(("Interest" + InterestCalculator.calculate(10000000, 8, 5 )));
		System.out.println(("Compound Interest" + CompoundInterestCalculator.calculate(10000000, 8, 5 )));

	}
}
/*
	master
	public class Main{
		public static void main(String[] args){
			System.out.println("Hello World");
		}
	}

	calculator
	14 - System.out.println("Addition" + Calculator.add(10, 15));
	
 */