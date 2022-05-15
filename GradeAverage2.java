import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in);
		String lectures[] = {"physics", "chemistry", "biology", "math", "grammer", "history"};
		int grades[] = {0, 0, 0, 0, 0, 0};
		double sum=0, average=0;
		
		for(int i=0; i<lectures.length; i++)
		{
			System.out.print("Please enter your grade for the " + lectures[i] + " course : ");
			int temp = input.nextInt();
			while(!(temp<=100 && temp>=0)) 
			{
				System.out.println("The entered grade must be [0 100]. ");
				System.out.print("Please enter your grade for the " + lectures[i] + " course : ");
			}
			grades[i] = temp;
			sum += grades[i];
		}
		
		average = sum/grades.length;
		boolean flag = (average >= 55);
		
		System.out.println("Your average grade : " + average);
		System.out.println(flag ? "Congratulations, you passed the class :)" : "Sorry, you failed the class :(");
    
	}
}
