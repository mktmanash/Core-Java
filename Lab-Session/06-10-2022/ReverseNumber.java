/*
  @author:MANASH KUMAR
  @date: 6 October 2022 
 Question2:WAP to find reverse of a number
  
 */

package core_Java;
import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	int num=sc.nextInt();
	int temp=num,rev=0,rem;
	//run loop until number becomes 0
	while(temp!=0) {
		//get last digit from num
		rem=temp%10;
		rev=rev*10+rem;
		//remove the last digit from num
		temp=temp/10;
		
	}
	System.out.println("Reverse of the " + num + " is: " + rev);
	

	}

}
