/*WAP to print Reverse of numbers for example 10 9 8 7 6 5 4 3 2 1
  using do-while loop and take the input from the user.
*/
package core_Java;
import java.util.Scanner;
 class DoWhile {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to print reverse from that number");
		int num=sc.nextInt();
		//implementation of do loop
		do
		{
			//loop body
		    System.out.print(num+" ");
		    //update expression
			num=num-1;
		}while(num>0);  //Condition check

	}

}
