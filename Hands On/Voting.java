//WAP to test whether the person is applicable to give vote or not using if-Else
import java.util.Scanner;
public class Voting {

	public static void main(String[] args) {
		//declaring variables
		int age;
		//taking values from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age");
		age=sc.nextInt();
		//checking conditions for voting
		if(age>=18)
		{
			System.out.println("welcome,You can Vote");
		}
		else {
			System.out.println("welcome,You can't Vote");
			
		}

	}

}
