import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		//creating scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name= sc.nextLine();
		System.out.println("enter your math marks");
		int math=sc.nextInt();
		System.out.println("enter your Physics marks");
		int physics=sc.nextInt();
		System.out.println("enter your Chemistry marks");
		int chem=sc.nextInt();
		System.out.println("enter your English marks");
		int eng=sc.nextInt();
		System.out.println("enter your Computer marks");
		int comp=sc.nextInt();
		//performing arithmetic operation 
		int total=math+physics+chem+eng+comp;
		float percentage= (total / 500) * 100;
		//apply nested if-Else statements
		if(percentage>=60) {
			System.out.println(name +" got "+ percentage +"; and grade A");
		}
		else if(percentage>=40) {
			System.out.println(name +" got "+ percentage +" ; and grade B");
		}
		else
		{
			System.out.println("Failed");
		}
		
		
		
		

	}

}
