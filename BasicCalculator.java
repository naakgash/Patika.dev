package deneme;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
    	int firstNumber=0, secondNumber=0, choice=0;

    	System.out.print("Enter the first number : ");
        firstNumber=input.nextInt();
        System.out.print("Enter the second number :");
        secondNumber=input.nextInt();
        
        System.out.println("1) Addition\n2) Subtraction\n3) Multiplication\n4) Division");
        System.out.println("Enter the number of the calculation you want to do:");
        choice=input.nextInt();

        switch (choice){
            case 1:
                System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                break;
            case 2:
            	System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                break;
            case 3:
            	System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                break;
            case 4:
                if (secondNumber == 0) {
                	System.out.println("The divisor cannot be 0. Try again.");
                }else {
                	System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                }
                break;
            default:
                System.out.println("You have entered invalid. Try again.");
        }
    }
}
