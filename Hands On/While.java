/*WAP to demonstrate while loop continues 
until entered number is positive.Take the input from the user*/
package core_Java;
import java.util.Scanner;

class While {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		//implementation of while loop ....test expresson
		while(num>=0)
		{
			System.out.println("positive number is "+num);
			num=sc.nextInt();
		}
		
		
		

	}

}
