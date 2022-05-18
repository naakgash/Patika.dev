import java.util.Scanner;

public class GradeAverage {

	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in);
		int physicsGrade, chemistryGrade, biologyGrade, mathGrade, grammerGrade, historyGrade;
		double sum, average;
		
		System.out.println("Please enter your grade for the physics course : ");
		physicsGrade = input.nextInt();
		
		System.out.println("Please enter your grade for the chemistry course : ");
		chemistryGrade = input.nextInt();
		
		System.out.println("Please enter your grade for the biologys course : ");
		biologyGrade = input.nextInt();
		
		System.out.println("Please enter your grade for the math course : ");
		mathGrade = input.nextInt();
		
		System.out.println("Please enter your grade for the grammer course : ");
		grammerGrade = input.nextInt();
		
		System.out.println("Please enter your grade for the history course : ");
		historyGrade = input.nextInt();
		
		sum = (physicsGrade + chemistryGrade + biologyGrade + mathGrade + grammerGrade + historyGrade);
		average = sum/6.0;
		boolean flag = (average >= 60);
		
		System.out.println("Your average grade : " + average);
		System.out.println(flag ? "Congratulations, you passed the class :)" : "Sorry, you failed the class :(");
    
	}
}
