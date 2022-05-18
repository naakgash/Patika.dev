import java.util.Scanner;

public class AdviceAcc2Weather {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);  
      double temp;
      System.out.println("How high is it today?");
      System.out.print("Enter degree:");
      temp = input.nextDouble();
      if(temp < 5)
      {
            System.out.println("You can ski. ");
      }
      else if( 5 <= temp && temp <= 25)
      {
            if(5 <= temp && temp <= 15)
            {
                System.out.println("You can go to cinema. ");
            }
            else if(15 < temp && temp <= 25)
            {
                System.out.println("You can picnic.");
            }
      }
      else
      {
            System.out.println("You can swim.");
      }

    }  

        
}
