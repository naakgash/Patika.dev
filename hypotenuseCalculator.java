import java.util.Scanner;

public class hypotenuseCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the length of the adjacent side of the triangle: ");
		int adjacentSide = input.nextInt();
		
		System.out.print("Please enter the length of the opposite side of the triangle: ");
		int oppositeSide = input.nextInt();
		
		double hypotenuseSide = Math.sqrt( Math.pow(adjacentSide,2) + Math.pow(oppositeSide,2) );
		System.out.println("Lenght of the hypotenuse side of the triangle: " + hypotenuseSide);
		
		double average = (adjacentSide + oppositeSide + hypotenuseSide) / 2;
		double areaLenght = Math.sqrt(average*(average-adjacentSide)*(average-oppositeSide)*(average-hypotenuseSide));
		System.out.println("The area length of the triangle: " + areaLenght);
	}
}
