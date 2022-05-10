import java.util.Scanner;

public class GrocerInvoiceCalculator {

	public static void main(String[] args) {
		double perKgPears = 2.14, perKgApple= 3.67, perKgTomato= 1.11, perKgBanana= 0.95, perKgEggplant= 5.00;

		Scanner input = new Scanner(System.in); 
		
		System.out.print("Please enter the amount of pears taken in kilograms: ");
		double pears = input.nextDouble();
		
		System.out.print("Please enter the amount of apple taken in kilograms: ");
		double apple = input.nextDouble();
		
		System.out.print("Please enter the amount of tomato taken in kilograms: ");
		double tomato = input.nextDouble();
		
		System.out.print("Please enter the amount of banana taken in kilograms: ");
		double banana = input.nextDouble();
		
		System.out.print("Please enter the amount of eggplant taken in kilograms: ");
		double eggplant = input.nextDouble();
		
		double total = (perKgPears*pears)+(perKgApple*apple)+(perKgTomato*tomato)+(perKgBanana*banana)+(perKgEggplant*eggplant);
		System.out.println("Total amount due: " + total);
	}
}
