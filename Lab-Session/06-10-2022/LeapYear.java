/*
  @author:MANASH KUMAR
  @date: 6 October 2022 
  
 Question1:WAP to Check for Leap Year.
          Take the input from the user.
*/
package core_Java;
import java.util.Scanner;

public class LeapYear 
{

	public static void main(String[] args) 
	{
    Scanner yr = new Scanner(System.in);
    System.out.println("enter year");
    int year=yr.nextInt();
    //year to be checked
    //if the year is divided by 4
    if(year%4==0)
    {
    	//if the year is century
    	if(year%100==0) 
    	{
    		//if the year is divided by 400
    		//then it is leap year
    		if(year%400==0)
    		{
    			System.out.println(year +" is a leap year");
    		}
    		else
    		{
    			System.out.println(year +" is not a leap year");   			
    		}
    	}
    	//if the year is not century
    		else
    		{
    			System.out.println(year +" is  a leap year");
    		}
    }
    		else 
    		{
    			System.out.println(year +" is not a leap year");
    		}    	
    }
}


