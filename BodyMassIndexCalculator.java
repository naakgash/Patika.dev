import java.util.Scanner;

public class BodyMassIndexCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your height in meters: ");
		double height = input.nextDouble();
		
		System.out.print("Please enter your weight in kilograms: ");
		double weight = input.nextDouble();
		
		double index = weight / (height*height);
		
		System.out.println("Your body mass index: " + index);
	}
}
