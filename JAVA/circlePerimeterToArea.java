import java.util.Scanner;

public class circlePerimeterToArea {

	public static void main(String[] args) {
		double PI_VALUE = 3.14159265359;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the perimeter of circle: ");
		Double perimeter = input.nextDouble();
		
		double radius = perimeter/(2*PI_VALUE);
		double area = PI_VALUE * Math.pow(radius, 2);
		
		System.out.println("Area of Circle: " + area);
	}
}
