//WAP to print table of any number using for loop and take the input from the user.
package core_Java;
import java.util.Scanner;
class Table
{

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter any Number");
	 int num=sc.nextInt();
	 System.out.println("Table of "+num+" is");
	 //for loop
	 for(int i=1;i<=10;i++) 
	 {
		 //body inside for loop 
		 System.out.println(num+ "*"+i+ "=" +(num*i));
	 }
		 
	     

	}

}
