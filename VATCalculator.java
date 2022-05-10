import java.util.Scanner;

public class VATCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the raw price: ");
		double rawPrice = input.nextDouble();
		
		double vatAmount = (rawPrice > 1000) ? rawPrice*0.08 : rawPrice*0.18;
		System.out.println("VAT Amount: " + vatAmount);
		System.out.println("Taxed Price: " + (rawPrice+vatAmount));
	}

}
