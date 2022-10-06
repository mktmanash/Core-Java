/*
  @author:MANASH KUMAR
  @date: 6 October 2022 
  Question4:WAP to check the condition for checking the
  correct password using If-Else.Take input from the user
*/
package core_Java;
import java.util.Scanner;


public class CheckPasword 
{
	
	public static void main(String[] args)
	{
	
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your username");
	  String userName=sc.nextLine();
	  System.out.println("Enter your password");
	  int password=sc.nextInt();
	  int systemPassword=12345;
	  //Password to be checked
	  if(password==systemPassword) 
	  {
		System.out.println("Login Successful");	
	  }
	  else 
	  {
		System.out.println("Login Denied");		
	  }

    }
}
