/*
  @author:MANASH KUMAR
  @date: 6 October 2022  
  Question3:WAP to create ReversePyramid
  
  */
 
package core_Java;
import java.util.Scanner;

public class Reversepyramid 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row=sc.nextInt();
		for(int i = row; i >= 1; i--)
	    {
	          
	        // Inner loop print space
	        for(int j = i; j <row; j++)
	        {
	            System.out.print(" ");
	        }
	          
	        // Inner loop print star
	        for(int j = 1; j <= (2 * i - 1); j++)
	        {
	            System.out.print("*");
	        }
	          
	        // Ending line after each row
	        System.out.println("");
	    } 

	}

}
