import java.util.Scanner;

public class UserLoginProgram 
{
    public static void main(String[] args) 
    {
    	Scanner input = new Scanner(System.in);
    	String userName = "patika";
    	String password = "java123";
    	
    	System.out.print("Please enter the username you want to login: ");
    	String tempUserName = input.nextLine();
    	while(!(tempUserName.equals(userName))) 
    	{
    		System.out.print("Invalid username. Please try again or enter 0 to create new account: ");
    		String control = input.nextLine();
    		if(control.equals("0")) 
    		{
    			System.out.print("Please enter a username to create a new account: ");
    			String newTempUserName = input.nextLine();
    			while (newTempUserName.equals(userName))
    			{
    				System.out.print("The username you entered is the same as before. Please try again:");
    				newTempUserName = input.nextLine();
    			}
    			userName = newTempUserName;
    			System.out.print("Please enter new password for \'" + userName + "\' :");
    			String newTempPassword = input.nextLine();
    			password = newTempPassword;
    			System.out.print("New account created!! ");
    			System.out.print("Please enter the username you want to login: ");
    			tempUserName = input.nextLine();
    		}
    		else if(control.equals(userName))
    		{
    			break;
    		}
    		else
    		{
    			tempUserName = control;
    		}
    	}
    	
    	System.out.print("Please enter your password for \'" + userName + "\' :");
    	String tempPassword = input.nextLine();
    	while(!(tempPassword.equals(password))) 
    	{
    		System.out.print("Invalid password. Please try again or enter 0 to uptade password for \'" + userName + "\': ");
    		String control = input.nextLine();
    		if(control.equals("0")) 
    		{
    			System.out.print("Please enter new password for \'" + userName + "\' :");
    			String newTempPassword = input.nextLine();
    			while (newTempPassword.equals(password))
    			{
    				System.out.print("The password you entered is the same as before. Please try again: ");
    				newTempPassword = input.nextLine();
    			}
    			password = newTempPassword;
    			System.out.print("New password created!! ");
    			System.out.print("Please enter your new password for \'" + userName + "\' :");
    	    	tempPassword = input.nextLine();
    			// 
    		}
    		else if(control.equals(password))
    		{
    			break;
    		}
    		else
    		{
    			tempPassword = control;
    		}
    	
    	}
    	System.out.println("Login successful. Welcome " + userName + " :)");
    	input.close();
    }
}
